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
@Table(name="telefone")
public class Telefone {

    @Id //Definir primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar valor automatico
    private int id;
    @Column(name="ddi")
    private String ddi;
    @Column(name="ddd")
    private String ddd;
    @Column(name="numero")
    private String numero;


}
