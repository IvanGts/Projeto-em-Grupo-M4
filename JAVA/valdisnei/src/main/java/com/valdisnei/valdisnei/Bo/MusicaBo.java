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
}
