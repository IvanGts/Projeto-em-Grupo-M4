package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica,Integer> {

}
