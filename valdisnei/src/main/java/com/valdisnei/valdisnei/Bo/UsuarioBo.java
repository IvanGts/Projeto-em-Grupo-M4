package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.UsuarioDto;
import com.valdisnei.valdisnei.Enum.TipoGenero;
import com.valdisnei.valdisnei.Model.Usuario;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class UsuarioBo {
    public Usuario parseToEntity(UsuarioDto dto, Usuario pEntity){
        if (pEntity == null)
            pEntity = new Usuario();

        if (dto == null)
            return pEntity;

        pEntity.setNome(dto.getNome());
        pEntity.setEmail(dto.getEmail());
        pEntity.setDataNascimento(dto.getDataNascimento());
        pEntity.setSenha(dto.getSenha());
        pEntity.setGenero(dto.getGenero());


        return pEntity;
    }
}
