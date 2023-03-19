package com.valdisnei.valdisnei.repository;
import com.valdisnei.valdisnei.Model.Telefone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends CrudRepository<Telefone, Integer> {

}

