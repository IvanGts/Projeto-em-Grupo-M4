package com.valdisnei.valdisnei.Repository;
import com.valdisnei.valdisnei.Model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}

