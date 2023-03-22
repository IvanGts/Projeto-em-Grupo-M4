package com.valdisnei.valdisnei.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Column(name = "data_de_nascimento")
    private String datadenascimento;
    private String premiacoes;
    private String genero;
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @OneToMany(mappedBy = "artista")
    @Nullable
    private List<Musica> musica;

    @OneToOne
    private Ator ator;
    @OneToOne
    private Musico musico;

}
