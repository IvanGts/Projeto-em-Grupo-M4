package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.BibliotecaBo;
import com.valdisnei.valdisnei.Dto.BibliotecaDto;
import com.valdisnei.valdisnei.Model.Biblioteca;
import com.valdisnei.valdisnei.Repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CrudBibliotecaService { // dependencia de classes CrudService
    @Autowired
    private BibliotecaRepository bibliotecaRepository;
    @Autowired
    private BibliotecaBo bibliotecaBo;
    public List<Biblioteca> pegarTodosBiblioteca(){
        return bibliotecaRepository.findAll();

    }
    public void editarBiblioteca(BibliotecaDto bibliotecaDto, int id){
        Optional<Biblioteca> biblioteca = bibliotecaRepository.findById(id);
        Biblioteca biblioteca1 = biblioteca.orElseThrow();
        bibliotecaBo.parseToEntity(bibliotecaDto, biblioteca1);
        bibliotecaRepository.save(biblioteca1);
    }

    public Biblioteca criarBiblioteca(BibliotecaDto bibliotecaDto) {
        Biblioteca biblioteca = bibliotecaBo.parseToEntity(bibliotecaDto,null);
        bibliotecaRepository.save(biblioteca);
        return biblioteca;
    }

    public void deleteBiblioteca(int id) {
        bibliotecaRepository.deleteById(id);
    }
}
