package com.valdisnei.valdisnei.Model;

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
    @Column(name="datadenascimento")
    private String datadenascimento;
    @Column(name="premicoes")
    private String premiacoes;
    @Column(name="genero")
    private String genero;

}
