package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter

public class BibliotecaDto {

    private int id;
    private Playlist playlist;
    private Midia midia;
    private Usuario usuario;

}