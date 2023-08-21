package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Dto.MusicaDto;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Repository.MidiaImage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MidiaBo {
    @Autowired
    private MusicaBo musicaBo;
    @Autowired
    private MidiaImage midiaImage;

    public Midia parseToEntity(MidiaDto dto, Midia pEntity){
        if (pEntity == null)
            pEntity = new Midia();

        if (dto == null)
            return pEntity;

        pEntity.setTitulo(dto.getTitulo());
        pEntity.setGenero(dto.getGenero());
        pEntity.setAno(dto.getAno());



        return pEntity;
    }

    public MidiaDto parseToDto(MidiaDto dto, Midia pEntity) {
        if (dto == null)
            dto = new MidiaDto();

        if (pEntity == null)
            return dto;

        dto.setTitulo(pEntity.getTitulo());
        dto.setAno(pEntity.getAno());
        dto.setGenero(pEntity.getGenero());
        dto.setMusicaDto(musicaBo.parseToDto(null, pEntity.getMusica()));
        
        // Requisitar link de imagem
        String tipoMidia = pEntity.getMusica()!=null?"Musica":"Filme";
        String image = midiaImage.mostrarUrlDe(pEntity.getMusica().getId(), tipoMidia);
        dto.setImage(image);

        return dto;

    }
}
