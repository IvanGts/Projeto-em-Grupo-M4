package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.UsuarioDto;
import com.valdisnei.valdisnei.Model.Usuario;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@Component
public class UsuarioBo {
    public Usuario parseToEntity(UsuarioDto dto, Usuario pEntity) throws ParseException {
        if (pEntity == null)
            pEntity = new Usuario();

        if (dto == null)
            return pEntity;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        pEntity.setNome(dto.getNome());
        pEntity.setEmail(dto.getEmail());
        pEntity.setDataNascimento(formato.parse(dto.getDataNascimento()));
        pEntity.setSenha(dto.getSenha());
        pEntity.setGenero(dto.getGenero());


        return pEntity;
    }
}
