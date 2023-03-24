package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator,Integer> {
}
