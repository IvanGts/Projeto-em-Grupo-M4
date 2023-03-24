package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca,Integer> {
}
