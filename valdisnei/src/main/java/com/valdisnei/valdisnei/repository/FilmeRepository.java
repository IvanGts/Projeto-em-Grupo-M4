package com.valdisnei.valdisnei.repository;

import com.valdisnei.valdisnei.Model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FilmeRepository extends JpaRepository<Filme,Integer> {
}
