package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Biblioteca")

public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @OneToOne
    private Usuario usuario;
    @OneToMany(mappedBy = "biblioteca")
    private List<Midia> midia;

    @OneToMany(mappedBy = "biblioteca")
    private List<Playlist> playlist;

}
