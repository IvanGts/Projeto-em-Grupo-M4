package com.valdisnei.valdisnei.Service;


import com.valdisnei.valdisnei.Bo.TelefoneBo;
import com.valdisnei.valdisnei.Dto.TelefoneDto;
import com.valdisnei.valdisnei.Model.Telefone;
import com.valdisnei.valdisnei.Repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CrudTelefoneService { // dependencia de classes CrudService
    @Autowired
    private TelefoneRepository telefoneRepository;
    @Autowired
    private TelefoneBo telefoneBo;
    public List<Telefone> pegarTodosTelefone(){
        return telefoneRepository.findAll();

    }
    public void editarTelefone(TelefoneDto telefoneDto, int id){
        Optional<Telefone> telefone = telefoneRepository.findById(id);
        Telefone telefone1 = telefone.orElseThrow();
        telefoneBo.parseToEntity(telefoneDto, telefone1);
        telefoneRepository.save(telefone1);
    }

    public Telefone criarTelefone(TelefoneDto telefoneDto) {
        Telefone telefone = telefoneBo.parseToEntity(telefoneDto,null);
        telefoneRepository.save(telefone);
        return telefone;
    }

    public void deleteTelefone(int id) {
        telefoneRepository.deleteById(id);
    }
}