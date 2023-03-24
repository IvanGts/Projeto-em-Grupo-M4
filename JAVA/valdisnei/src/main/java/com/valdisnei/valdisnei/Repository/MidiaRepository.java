package com.valdisnei.valdisnei.Repository;

import com.valdisnei.valdisnei.Model.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidiaRepository extends JpaRepository <Midia,Integer> {
}
