package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.ArtistaDto;
import com.valdisnei.valdisnei.Model.Artista;
import com.valdisnei.valdisnei.Service.CrudArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/artistas")
@RestController
public class ArtistaController {
    @Autowired
    private CrudArtistaService crudArtistaService;

    @PostMapping
    public ResponseEntity criarArtista(@RequestBody ArtistaDto artistaDto){
        Artista artista = crudArtistaService.criarArtista(artistaDto);
        return ResponseEntity.ok(artista);
    }
    @GetMapping("/todosartistas")
    public List<Artista> pegarTodosArtistas(){
        return crudArtistaService.pegarTodosArtistas();

    }
    @PutMapping("{id}")
    public void editarArtista(@RequestBody ArtistaDto artistaDto, @PathVariable int id){
        crudArtistaService.editarArtista(artistaDto, id);

    }
    @DeleteMapping("{id}")
    public  void deleteArtista(@PathVariable int id){
        crudArtistaService.deleteArtista(id);
    }
}
