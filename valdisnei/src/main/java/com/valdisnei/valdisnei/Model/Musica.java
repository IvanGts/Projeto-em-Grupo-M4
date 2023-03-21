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
@Table(name = "Musica")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="duracao")
    private double duracao;

    @Column(name="nota")
    private int nota;

    @ManyToOne      //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_artista_id", referencedColumnName = "id")
    private Artista artista;

}
