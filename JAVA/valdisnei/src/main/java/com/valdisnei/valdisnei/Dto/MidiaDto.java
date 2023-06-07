package com.valdisnei.valdisnei.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MidiaDto {
    private String titulo;
    private int ano;
    private String genero;
    private PlaylistDto playlistDto;
    private MusicaDto musicaDto;
    private FilmeDto filmeDto;
    private BibliotecaDto bibliotecaDto;
    private String image;
}
