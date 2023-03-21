package com.valdisnei.valdisnei.Model;

<<<<<<< HEAD
import jakarta.persistence.*;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;

>>>>>>> 3d939e739233297bbc54818af51ff1bbb9bd39fe
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
<<<<<<< HEAD
@AllArgsConstructor
@Table(name="Playlist")
=======

>>>>>>> 3d939e739233297bbc54818af51ff1bbb9bd39fe
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
    private Midia midia;

}
