package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.AtorBo;
import com.valdisnei.valdisnei.Dto.AtorDto;
import com.valdisnei.valdisnei.Model.Ator;
import com.valdisnei.valdisnei.Repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudAtorService {
    @Autowired
    private AtorRepository atorRepository;
    @Autowired
    private AtorBo atorBo;
    public List<Ator> pegarTodosAtores(){
        return atorRepository.findAll();

    }
    public void editarAtor(AtorDto atorDto, int id){
        Optional<Ator> ator = atorRepository.findById(id);
        Ator ator1 = ator.orElseThrow();
        atorBo.parseToEntity(atorDto, ator1);
        atorRepository.save(ator1);
    }

    public Ator criarAtor(AtorDto atorDto) {
        Ator ator = atorBo.parseToEntity(atorDto,null);
        atorRepository.save(ator);
        return ator;
    }

    public void deleteAtor(int id) {
        atorRepository.deleteById(id);
    }
}
