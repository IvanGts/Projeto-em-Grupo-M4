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
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String datadenascimento;
    private String premiacoes;
    private String genero;

    @OneToOne
    @JoinColumn(name = "fk_ator_id", referencedColumnName = "id")
    private Ator ator;

    @OneToOne
    @JoinColumn(name = "fk_musico_id", referencedColumnName = "id")
    private Musico musico;
}
