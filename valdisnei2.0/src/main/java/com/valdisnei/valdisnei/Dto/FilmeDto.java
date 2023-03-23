package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Artista;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilmeDto {
    private Double duracao;
    private String tipo;
    private List<Artista> elenco;
    private String diretor;
    private String produtor;
}
