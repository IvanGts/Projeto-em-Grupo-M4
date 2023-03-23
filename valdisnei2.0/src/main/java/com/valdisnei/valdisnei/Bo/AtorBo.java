package com.valdisnei.valdisnei.Bo;


import com.valdisnei.valdisnei.Dto.AtorDto;
import com.valdisnei.valdisnei.Model.Ator;
import org.springframework.stereotype.Service;

@Service
public class AtorBo {
    public Ator parseToEntity(AtorDto dto, Ator pEntity){
        if (pEntity == null)
            pEntity = new Ator();

        if (dto == null)
            return pEntity;

        pEntity.setFormacao(dto.getFormacao());

        return pEntity;
    }
}
