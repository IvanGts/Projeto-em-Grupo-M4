package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.ArtistaDto;
import com.valdisnei.valdisnei.Model.Artista;
import org.springframework.stereotype.Component;

@Component
public class ArtistaBo {
    public Artista parseToEntity(ArtistaDto dto, Artista pEntity){
        if (pEntity == null)
            pEntity = new Artista();

        if (dto == null)
            return pEntity;

        pEntity.setNome(dto.getNome());
        pEntity.setDatadenascimento(dto.getDatadenascimento());
        pEntity.setPremiacoes(dto.getPremiacoes());
        pEntity.setGenero(dto.getGenero());


        return pEntity;
    }
}
