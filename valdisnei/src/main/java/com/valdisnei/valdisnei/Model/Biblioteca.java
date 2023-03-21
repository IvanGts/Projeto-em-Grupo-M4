package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @OneToMany     //varias playlists para uma biblioteca
    @JoinColumn(name = "fk_playlist_id", referencedColumnName = "id")
    private List<Playlist> playlists;

    @OneToMany
    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
    private List<Midia> midias;

    @ManyToOne
    @JoinColumn(name = "fk_usuario_id", referencedColumnName = "id")
    private Usuario usuario;

}
