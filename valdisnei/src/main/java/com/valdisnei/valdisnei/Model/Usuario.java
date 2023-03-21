package com.valdisnei.valdisnei.Model;

import com.valdisnei.valdisnei.Enum.TipoGenero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name="data_nascimento")
    private Date dataNascimento;
    @Column(name="email",nullable = false, unique = true)

    private String email;
    @Column(name="senha",nullable = false)

    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoGenero genero;
    @OneToOne
    @JoinColumn(name = "fk_telefone_id", referencedColumnName = "id")
    private Telefone telefone;

}
