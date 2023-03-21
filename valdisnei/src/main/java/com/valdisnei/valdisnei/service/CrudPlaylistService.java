package com.valdisnei.valdisnei.service;

import com.valdisnei.valdisnei.Bo.PlaylistBo;
import com.valdisnei.valdisnei.Model.Playlist;
import com.valdisnei.valdisnei.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CrudPlaylistService { // dependencia de classes CrudService
    @Autowired
    private PlaylistRepository playlistRepository;
    @Autowired
    private PlaylistBo PlaylistBo;
    public List<Playlist> pegarTodasPlaylist(){
        return playlistRepository.findAll();

    }
    public void editarPlaylist(PlaylistDto playlistDto, int id){
        Optional<Playlist> playlist = playlistRepository.findById(id);
        Playlist playlist1 = playlist.orElseThrow();
        playlistBo.parseToEntity(playlistDto, playlist1);
        playlistRepository.save(playlist1);
    }

    public Playlist criarPlaylist(PlaylistDto playlistDto) {
        Playlist playlist = playlistBo.parseToEntity(playlistDto, null);
        playlistRepository.save(playlist);
        return playlist;
    }

    public void deletePlaylist(int id) {
        playlistRepository.deleteById(id);
    }
}
