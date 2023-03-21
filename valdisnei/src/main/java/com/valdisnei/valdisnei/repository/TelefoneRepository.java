package com.valdisnei.valdisnei.repository;
import com.valdisnei.valdisnei.Model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}

