package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Musico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicoRepository extends JpaRepository <Musico,Integer> {
}
