package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Dto.ArtistaDto;
import com.valdisnei.valdisnei.Bo.ArtistaBo;
import com.valdisnei.valdisnei.Model.Artista;
import com.valdisnei.valdisnei.Repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CrudArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;
    @Autowired
    private ArtistaBo artistaBo;
    public List<Artista> pegarTodosArtistas(){
        return artistaRepository.findAll();

    }
    public void editarArtista(ArtistaDto artistaDto, int id){
        Optional<Artista> artista = artistaRepository.findById(id);
        Artista artista1 = artista.orElseThrow();
        artistaBo.parseToEntity(artistaDto, artista1);
        artistaRepository.save(artista1);
    }

    public Artista criarArtista(ArtistaDto artistaDto) {
        Artista artista = artistaBo.parseToEntity(artistaDto,null);
        artistaRepository.save(artista);
        return artista;
    }

    public void deleteArtista(int id) {
        artistaRepository.deleteById(id);
    }
}
