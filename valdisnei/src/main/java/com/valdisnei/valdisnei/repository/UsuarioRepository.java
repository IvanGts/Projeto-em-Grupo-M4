package com.valdisnei.valdisnei.repository;


import com.valdisnei.valdisnei.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {

}
