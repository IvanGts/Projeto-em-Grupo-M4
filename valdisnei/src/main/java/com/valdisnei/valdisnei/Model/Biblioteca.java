package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    @OneToOne
    @JoinColumn(name = "fk_playlist_id", referencedColumnName = "id")
    private Playlist playlist;
}
