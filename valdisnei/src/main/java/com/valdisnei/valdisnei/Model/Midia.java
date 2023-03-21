package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Midia")
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="ano")
    private int ano;
    @Column(name="genero")
    private String genero;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_filme_id", referencedColumnName = "id")
    private List<Filme> filme;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_musica_id", referencedColumnName = "id")
    private List<Musica> musica;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_artista_id", referencedColumnName = "id")
    private List<Artista> artistas;

    @ManyToOne     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_playlist_id", referencedColumnName = "id")
    private Playlist playlist;

}
