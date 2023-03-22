package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.FilmeBo;
import com.valdisnei.valdisnei.Dto.FilmeDto;
import com.valdisnei.valdisnei.Model.Filme;
import com.valdisnei.valdisnei.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CrudFilmeService { // dependencia de classes CrudService
    @Autowired
    private FilmeRepository filmeRepository;
    @Autowired
    private FilmeBo filmeBo;
    public List<Filme> pegarTodosFilmes(){
        return filmeRepository.findAll();

    }
    public void editarFilme(FilmeDto filmeDto, int id){
        Optional<Filme> filme = filmeRepository.findById(id);
        Filme filme1 = filme.orElseThrow();
        filmeBo.parseToEntity(filmeDto, filme1);
        filmeRepository.save(filme1);
    }

    public Filme criarFilme(FilmeDto filmeDto) {
        Filme filme = filmeBo.parseToEntity(filmeDto,null);
        filmeRepository.save(filme);
        return filme;
    }

    public void deleteFilme(int id) {
        filmeRepository.deleteById(id);
    }
}
