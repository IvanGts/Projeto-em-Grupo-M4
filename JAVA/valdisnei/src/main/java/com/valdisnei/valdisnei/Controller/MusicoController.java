package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.MusicoDto;
import com.valdisnei.valdisnei.Model.Musico;
import com.valdisnei.valdisnei.Service.CrudMusicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/musico")
@RestController
public class MusicoController {
    @Autowired
    private CrudMusicoService crudMusicoService;

    @PostMapping("/cadastro")
    public ResponseEntity criarMusico(@RequestBody MusicoDto musicoDto){
        Musico musico = crudMusicoService.criarMusico(musicoDto);
        return ResponseEntity.ok(musico);
    }

    @GetMapping("/todos")
    public List<Musico> pegarTodosMusicos(){
        return crudMusicoService.pegarTodosMusicos();
    }

    @PutMapping("{id}")
    public void editarMusico(@RequestBody MusicoDto usuarioDto, @PathVariable int id){
        crudMusicoService.editarMusico(usuarioDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteMusico(@PathVariable int id){
        crudMusicoService.deleteMusico(id);
    }

}