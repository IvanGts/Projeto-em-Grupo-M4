package com.valdisnei.valdisnei.Model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String ordemDeExecucao;
    private int midiaAtual;
    @OneToMany
    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
    public List<Midia> midias;


}
