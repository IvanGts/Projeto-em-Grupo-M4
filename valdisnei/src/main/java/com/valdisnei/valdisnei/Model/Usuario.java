package com.valdisnei.valdisnei.Model;

import com.valdisnei.valdisnei.Enum.TipoGenero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

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
    @Column(name="data_de_nascimento")
    private Date dataNascimento;
    @Column(name="email",nullable = false, unique = true)
    private String email;
    @Column(name="senha",nullable = false)
    private String senha;
    @OneToOne
    @JoinColumn(name = "fk_telefone_id", referencedColumnName = "id")
    private Telefone telefone;
    @Enumerated(EnumType.STRING)
    private TipoGenero genero;
    @OneToMany
    @JoinColumn(name = "fk_biblioteca_id", referencedColumnName = "id")
    private List<Biblioteca> bibliotecas;
}
