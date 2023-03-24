package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.MusicaDto;
import com.valdisnei.valdisnei.Model.Musica;
import com.valdisnei.valdisnei.Service.CrudMusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/musica")
@RestController
public class MusicaController {
    @Autowired
    private CrudMusicaService crudMusicaService;

    @PostMapping("/cadastro")
    public ResponseEntity criarMusica(@RequestBody MusicaDto musicaDto){
        Musica musica = crudMusicaService.criarMusica(musicaDto);
        return ResponseEntity.ok(musica);
    }

    @GetMapping("/todos")
    public List<Musica> pegarTodosMusicas(){
        return crudMusicaService.pegarTodosMusicas();
    }

    @PutMapping("{id}")
    public void editarMusica(@RequestBody MusicaDto usuarioDto, @PathVariable int id){
        crudMusicaService.editarMusica(usuarioDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteMusica(@PathVariable int id){
        crudMusicaService.deleteMusica(id);
    }

}