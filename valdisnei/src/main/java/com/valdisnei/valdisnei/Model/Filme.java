package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
import java.util.ArrayList;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double duracao;
    private String tipo;
//    private ArrayList elenco;
    private String diretor;
    private String produtor;

    @OneToMany   //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_artista_id", referencedColumnName = "id")
    private List<Artista> elenco;

//    @OneToMany   //varias playlists para uma biblioteca
//    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
//    private Midia midia;

}
