package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.FilmeDto;
import com.valdisnei.valdisnei.Model.Filme;
import com.valdisnei.valdisnei.Service.CrudFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/filme")
@RestController
public class FilmeController {
    @Autowired
    private CrudFilmeService crudFilmeService;

    @PostMapping("/cadastro")
    public ResponseEntity criarFilme(@RequestBody FilmeDto filmeDto){
        Filme filme = crudFilmeService.criarFilme(filmeDto);
        return ResponseEntity.ok(filme);
    }

    @GetMapping("/todos")
    public List<Filme> pegarTodosFilmes(){
        return crudFilmeService.pegarTodosFilmes();
    }

    @PutMapping("{id}")
    public void editarFilme(@RequestBody FilmeDto filmeDto, @PathVariable int id){
        crudFilmeService.editarFilme(filmeDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteFilme(@PathVariable int id){
        crudFilmeService.deleteFilme(id);
    }

}