package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.BibliotecaDto;
import com.valdisnei.valdisnei.Model.Biblioteca;
import org.springframework.stereotype.Component;

@Component
public class BibliotecaBo {
    public Biblioteca parseToEntity(BibliotecaDto dto, Biblioteca pEntity){
        if (pEntity == null)
            pEntity = new Biblioteca();

        if (dto == null)
            return pEntity;



        return pEntity;
    }
}