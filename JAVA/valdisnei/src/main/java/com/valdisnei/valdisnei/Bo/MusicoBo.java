package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.MusicoDto;
import com.valdisnei.valdisnei.Model.Musico;
import org.springframework.stereotype.Component;

@Component
public class MusicoBo {
    public Musico parseToEntity(MusicoDto dto, Musico pEntity){
        if (pEntity == null)
            pEntity = new Musico();

        if (dto == null)
            return pEntity;

        pEntity.setAtuacao(dto.getAtuacao());
        pEntity.setArtista(dto.getArtista());

        return pEntity;
    }
}
