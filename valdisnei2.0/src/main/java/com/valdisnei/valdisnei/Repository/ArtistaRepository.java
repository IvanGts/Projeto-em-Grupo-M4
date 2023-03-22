package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista,Integer> {
}
