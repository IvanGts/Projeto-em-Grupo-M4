package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Midia")
@AllArgsConstructor
@NoArgsConstructor


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

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;
    @OneToOne
    @JoinColumn(name ="musica", referencedColumnName = "id")
    private Musica musica;
    @OneToOne
    @JoinColumn(name = "filme", referencedColumnName = "id")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "bibilioteca_id")
    private Biblioteca biblioteca;
}
