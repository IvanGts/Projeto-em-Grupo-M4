package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.FilmeDto;
import com.valdisnei.valdisnei.Model.Filme;
import org.springframework.stereotype.Component;

@Component
public class FilmeBo {
    public Filme parseToEntity(FilmeDto dto, Filme pEntity){
        if (pEntity == null)
            pEntity = new Filme();

        if (dto == null)
            return pEntity;

        pEntity.setTipo(dto.getTipo());
        pEntity.setDuracao(dto.getDuracao());
        pEntity.setDiretor(dto.getDiretor());
        pEntity.setProdutor(dto.getProdutor());
        pEntity.setElenco(dto.getElenco());

        return pEntity;
    }
}