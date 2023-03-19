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
    @Column(nullable = false)
    private String nome;
    private Date dataNascimento;
    @Column(nullable = false, unique = true)

    private String email;
    @Column(nullable = false)

    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoGenero genero;
    @OneToOne
    @JoinColumn(name = "fk_telefone_id", referencedColumnName = "id")
    private Telefone telefone;

}
