package com.valdisnei.valdisnei.repository;

import com.valdisnei.valdisnei.Model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface PlaylistRepository extends JpaRepository <Playlist, Integer> {

}
