package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Artista;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicaDto {

    private double duracao;
    private ArtistaDto artistaDto;
    private int nota;
}
