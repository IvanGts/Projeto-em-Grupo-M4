package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.PlaylistDto;
import com.valdisnei.valdisnei.Model.Playlist;
import com.valdisnei.valdisnei.Service.CrudPlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/playlist")
@RestController
public class PlaylistController {
    @Autowired
    private CrudPlaylistService crudPlaylistService;

    @PostMapping("/cadastro")
    public ResponseEntity criarPlaylist(@RequestBody PlaylistDto playlistDto){
        Playlist playlist = crudPlaylistService.criarPlaylist(playlistDto);
        return ResponseEntity.ok(playlist);
    }

    @GetMapping("/todos")
    public List<Playlist> pegarTodosPlaylist(){
        return crudPlaylistService.pegarTodosPlaylist();
    }

    @PutMapping("{id}")
    public void editarPlaylist(@RequestBody PlaylistDto playlistDto, @PathVariable int id){
        crudPlaylistService.editarPlaylist(playlistDto, id);
    }

    @DeleteMapping("{id}")
    public  void deletePlaylist(@PathVariable int id){
        crudPlaylistService.deletePlaylist(id);
    }

}