package com.valdisnei.valdisnei.Model;

import java.util.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@Table(name="Artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nome")
    private String nome;
    @Column(name="data_de_nascimento")
    private String datadenascimento;
    @Column(name="premicoes")
    private String premiacoes;
    @Column(name="genero")
    private String genero;

    @OneToOne
    @JoinColumn(name = "fk_ator_id", referencedColumnName = "id")
    private Ator ator;

    @OneToOne
    @JoinColumn(name = "fk_musico_id", referencedColumnName = "id")
    private Musico musico;
}
