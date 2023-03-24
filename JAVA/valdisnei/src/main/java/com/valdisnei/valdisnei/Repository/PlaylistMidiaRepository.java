package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.PlaylistMidia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistMidiaRepository extends JpaRepository <PlaylistMidia, Integer> {
}
