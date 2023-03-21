package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double duracao;
    private int nota;

    @ManyToOne      //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_artista_id", referencedColumnName = "id")
    private Artista artista;

}
