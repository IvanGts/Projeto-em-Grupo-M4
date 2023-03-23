package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.MusicaBo;
import com.valdisnei.valdisnei.Dto.MusicaDto;
import com.valdisnei.valdisnei.Model.Musica;
import com.valdisnei.valdisnei.Repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudMusicaService { // dependencia de classes CrudService
    @Autowired
    private MusicaRepository musicaRepository;
    @Autowired
    private MusicaBo musicaBo;
    public List<Musica> pegarTodosMusicas(){
        return musicaRepository.findAll();

    }
    public void editarMusica(MusicaDto musicaDto, int id){
        Optional<Musica> musica = musicaRepository.findById(id);
        Musica musica1 = musica.orElseThrow();
        musicaBo.parseToEntity(musicaDto, musica1);
        musicaRepository.save(musica1);
    }

    public Musica criarMusica(MusicaDto musicaDto) {
        Musica musica = musicaBo.parseToEntity(musicaDto,null);
        musicaRepository.save(musica);
        return musica;
    }

    public void deleteMusica(int id) {
        musicaRepository.deleteById(id);
    }
}