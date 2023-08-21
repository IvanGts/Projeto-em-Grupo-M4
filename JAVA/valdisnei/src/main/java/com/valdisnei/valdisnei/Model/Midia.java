package com.valdisnei.valdisnei.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    
    
    // Propriedade pode não ser necessária.
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @OneToOne
    // @JsonIgnore -- ver se ele me permite ver o objeto Musica no retorno
    @JoinColumn(name ="musica", referencedColumnName = "id")
    private Musica musica;
    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "filme", referencedColumnName = "id")
    private Filme filme;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "bibilioteca_id")
    private Biblioteca biblioteca;
}
