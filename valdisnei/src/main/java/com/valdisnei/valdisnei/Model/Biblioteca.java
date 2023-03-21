package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Biblioteca")
=======
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> 3d939e739233297bbc54818af51ff1bbb9bd39fe
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    @OneToOne
    @JoinColumn(name = "fk_playlist_id", referencedColumnName = "id")
    private Playlist playlist;

}
