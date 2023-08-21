package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.MusicaDto;
import com.valdisnei.valdisnei.Model.Musica;
import org.springframework.stereotype.Component;

@Component
public class MusicaBo {
    public Musica parseToEntity(MusicaDto dto, Musica pEntity){
        if (pEntity == null)
            pEntity = new Musica();

        if (dto == null)
            return pEntity;

        pEntity.setDuracao(dto.getDuracao());
        pEntity.setArtista(dto.getArtista());



        return pEntity;
    }

    public MusicaDto parseToDto(MusicaDto dto, Musica pEntity) {
        if (dto == null)
            dto = new MusicaDto();
        
        if (pEntity == null)
            return dto;

        dto.setDuracao(pEntity.getDuracao());
        dto.setArtista(pEntity.getArtista());



        return dto;
    }
}
