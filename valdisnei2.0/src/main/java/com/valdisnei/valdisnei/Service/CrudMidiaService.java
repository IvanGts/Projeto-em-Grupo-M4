package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.MidiaBo;
import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Repository.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CrudMidiaService { // dependencia de classes CrudService
    @Autowired
    private MidiaRepository midiaRepository;
    @Autowired
    private MidiaBo midiaBo;
    public List<Midia> pegarTodosMidia(){
        return midiaRepository.findAll();

    }
    public void editarMidia(MidiaDto midiaDto, int id){
        Optional<Midia> midia = midiaRepository.findById(id);
        Midia midia1 = midia.orElseThrow();
        midiaBo.parseToEntity(midiaDto, midia1);
        midiaRepository.save(midia1);
    }

    public Midia criarMidia(MidiaDto midiaDto) {
        Midia midia = midiaBo.parseToEntity(midiaDto,null);
        midiaRepository.save(midia);
        return midia;
    }

    public void deleteMidia(int id) {
        midiaRepository.deleteById(id);
    }
}