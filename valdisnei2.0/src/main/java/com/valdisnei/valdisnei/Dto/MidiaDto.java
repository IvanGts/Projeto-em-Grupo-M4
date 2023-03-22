package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Biblioteca;
import com.valdisnei.valdisnei.Model.Filme;
import com.valdisnei.valdisnei.Model.Musica;
import com.valdisnei.valdisnei.Model.Playlist;
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
}
