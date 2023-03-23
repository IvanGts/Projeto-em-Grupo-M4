package com.valdisnei.valdisnei.Controller;


import com.valdisnei.valdisnei.Dto.AtorDto;
import com.valdisnei.valdisnei.Model.Ator;
import com.valdisnei.valdisnei.Service.CrudAtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ator")
@RestController
@CrossOrigin(origins = "*")
public class AtorController {
    @Autowired
    private CrudAtorService crudAtorService;

    @PostMapping
    public ResponseEntity criarAtor(@RequestBody AtorDto atorDto){
        Ator ator = crudAtorService.criarAtor(atorDto);
        return ResponseEntity.ok(ator);
    }
    @GetMapping("/todosatores")
    public List<Ator> pegarTodosAtores(){
        return crudAtorService.pegarTodosAtores();

    }
    @PutMapping("{id}")
    public void editarAtor(@RequestBody AtorDto atorDto, @PathVariable int id){
        crudAtorService.editarAtor(atorDto, id);
    }
    @DeleteMapping("{id}")
    public  void deleteAtor(@PathVariable int id){
        crudAtorService.deleteAtor(id);
    }
}
