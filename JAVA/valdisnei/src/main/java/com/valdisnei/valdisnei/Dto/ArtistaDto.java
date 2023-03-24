package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Ator;
import com.valdisnei.valdisnei.Model.Filme;
import com.valdisnei.valdisnei.Model.Musica;
import com.valdisnei.valdisnei.Model.Musico;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArtistaDto {
    private String nome;
    private String datadenascimento;
    private String premiacoes;
    private String genero;
    private FilmeDto filmeDto;
    private List<MusicaDto> musicaDto;
    private AtorDto atorDto;
    private MusicoDto musicoDto;
}
