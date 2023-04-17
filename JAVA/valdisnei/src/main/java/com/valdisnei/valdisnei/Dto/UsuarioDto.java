package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Enum.TipoGenero;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class UsuarioDto {
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private TipoGenero genero;
    private int telefone;
}

