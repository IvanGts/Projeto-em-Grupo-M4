package com.valdisnei.valdisnei.repository;

import com.valdisnei.valdisnei.Model.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface MidiaRepository extends JpaRepository<MidiaRepository,Integer> {
}
