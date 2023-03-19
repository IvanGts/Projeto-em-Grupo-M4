package com.valdisnei.valdisnei.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {

    @Id //Definir primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar valor automatico
    private int id;
    private String ddi;
    private String ddd;
    private String numero;


}
