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
    @ManyToOne
    @JoinColumn(name = "artista_id")
    private Artista artista;
    private int nota;
}
