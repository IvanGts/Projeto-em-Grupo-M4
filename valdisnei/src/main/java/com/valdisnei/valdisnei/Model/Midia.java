package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String ano;
    private String genero;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_filme_id", referencedColumnName = "id")
    private Filme filme;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_musica_id", referencedColumnName = "id")
    private Musica musica;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_artista_id", referencedColumnName = "id")
    private List<Artista> artistas;
}
