package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Service.CrudMidiaService;
import com.valdisnei.valdisnei.Service.CrudPlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/midia")
@RestController
public class MidiaController {
    @Autowired
    private CrudMidiaService crudMidiaService;
    @Autowired
    private CrudPlaylistService crudPlaylistService;
    @PostMapping("/cadastro")
    public ResponseEntity criarMidia(@RequestBody MidiaDto midiaDto){
        Midia midia = crudMidiaService.criarMidia(midiaDto);
        return ResponseEntity.ok(midia);
    }

    @PostMapping("/addMidia/{idMidia}/Playlist/{idPlaylist}")
    public void addMidiaPlaylist(@PathVariable int idMidia,@PathVariable int idPlaylist){
    crudMidiaService.addMidiaPlaylist(idMidia,idPlaylist);
    }

    @GetMapping("/todos")
    public List<Midia> pegarTodasMidias(){
        return crudMidiaService.pegarTodasMidias();
    }
    @GetMapping("/aleatorios")
    public List<Midia> pegarTodasMidiasAleatoria(){
    return crudMidiaService.pegarTodasMidiasAleatoria();
    }
    @PutMapping("{id}")
    public void editarMidia(@RequestBody MidiaDto midiaDto, @PathVariable int id){
        crudMidiaService.editarMidia(midiaDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteMidia(@PathVariable int id){
        crudMidiaService.deleteMidia(id);
    }

}
