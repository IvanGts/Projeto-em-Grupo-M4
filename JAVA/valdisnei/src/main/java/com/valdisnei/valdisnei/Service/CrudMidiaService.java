package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.MidiaBo;
import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Model.Playlist;
import com.valdisnei.valdisnei.Model.PlaylistMidia;
import com.valdisnei.valdisnei.Repository.MidiaImage;
import com.valdisnei.valdisnei.Repository.MidiaRepository;
import com.valdisnei.valdisnei.Repository.PlaylistMidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class CrudMidiaService { // dependencia de classes CrudService
    @Autowired
    private MidiaRepository midiaRepository;
    @Autowired
    private MidiaBo midiaBo;
    @Autowired
    private CrudPlaylistService crudPlaylistService;
    @Autowired
    private PlaylistMidiaRepository playlistMidiaRepository;
    

    public List<Midia> pegarTodasMidias(){
        return midiaRepository.findAll();

    }
    public void editarMidia(MidiaDto midiaDto, int id){
        Optional<Midia> midia = midiaRepository.findById(id);
        Midia midia1 = midia.orElseThrow();
        midiaBo.parseToEntity(midiaDto, midia1);
        midiaRepository.save(midia1);
    }

    public Midia criarMidia(MidiaDto midiaDto) {
        Midia midia = midiaBo.parseToEntity(midiaDto,null);
        midiaRepository.save(midia);
        return midia;
    }

    public void deleteMidia(int id) {
        midiaRepository.deleteById(id);
    }

    public List<Midia> pegarTodasMidiasAleatoria() {
        List<Midia> midias = this.pegarTodasMidias();
        Collections.shuffle(midias);
        return midias;
    }

    // public void addMidiaPlaylist(int idMidia, int idPlaylist) {
    //     Playlist idPlaylist1 = crudPlaylistService.pegarPlaylist(idPlaylist);
    //     Midia idMidia1 = this.pegarMidia(idMidia);
    //     PlaylistMidia playlistMidia = new PlaylistMidia();
    //     playlistMidia.setPlaylist(idPlaylist1);
    //     playlistMidia.setMidia(idMidia1);
    //     playlistMidiaRepository.save(playlistMidia);
    // }

    public MidiaDto pegarMidia(int idMidia) {
        Optional<Midia> midia = midiaRepository.findById(idMidia);
        Midia midiaFound = midia.orElseThrow();
        MidiaDto dMidiaDto = midiaBo.parseToDto(null, midiaFound);
        return dMidiaDto;
    }
}