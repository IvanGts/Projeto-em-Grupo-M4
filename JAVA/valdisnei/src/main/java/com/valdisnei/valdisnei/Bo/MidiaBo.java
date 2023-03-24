package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Model.Midia;
import org.springframework.stereotype.Component;

@Component
public class MidiaBo {
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
}
