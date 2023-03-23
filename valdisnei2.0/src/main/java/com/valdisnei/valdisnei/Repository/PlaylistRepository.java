package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlaylistRepository extends JpaRepository<Playlist,Integer> {
}
