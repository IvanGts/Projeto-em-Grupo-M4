package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "filme")
    private List<Artista> elenco;
    private String diretor;
    private String produtor;
}
