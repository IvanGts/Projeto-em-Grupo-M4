package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Telefone {

    @Id //Definir primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar valor automatico
    private int id;
    private String ddi;
    private String ddd;
    private String numero;


}
