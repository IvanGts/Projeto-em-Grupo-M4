package com.valdisnei.valdisnei.repository;

import com.valdisnei.valdisnei.Model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PlaylistRepository extends JpaRepository <Playlist, Integer> {

}
