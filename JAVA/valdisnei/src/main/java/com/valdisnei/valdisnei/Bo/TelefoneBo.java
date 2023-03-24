package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.TelefoneDto;
import com.valdisnei.valdisnei.Model.Telefone;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class TelefoneBo {
    public Telefone parseToEntity(TelefoneDto dto, Telefone pEntity){
        if (pEntity == null)
            pEntity = new Telefone();

        if (dto == null)
            return pEntity;

        pEntity.setDdi(dto.getDdi());
        pEntity.setDdd(dto.getDdd());
        pEntity.setNumero(dto.getNumero());


        return pEntity;
    }
}

