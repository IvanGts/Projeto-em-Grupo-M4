package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.MusicoBo;
import com.valdisnei.valdisnei.Dto.MusicoDto;
import com.valdisnei.valdisnei.Model.Musico;
import com.valdisnei.valdisnei.Repository.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CrudMusicoService {
    @Autowired
    private MusicoRepository musicoRepository;
    @Autowired
    private MusicoBo musicoBo;
    public List<Musico> pegarTodosMusicos(){
        return musicoRepository.findAll();

    }
    public void editarMusico(MusicoDto musicoDto, int id){
        Optional<Musico> musico = musicoRepository.findById(id);
        Musico musico1 = musico.orElseThrow();
        musicoBo.parseToEntity(musicoDto, musico1);
        musicoRepository.save(musico1);
    }

    public Musico criarMusico(MusicoDto musicoDto) {
        Musico musico = musicoBo.parseToEntity(musicoDto,null);
        musicoRepository.save(musico);
        return musico;
    }

    public void deleteMusico(int id) {
        musicoRepository.deleteById(id);
    }
}

