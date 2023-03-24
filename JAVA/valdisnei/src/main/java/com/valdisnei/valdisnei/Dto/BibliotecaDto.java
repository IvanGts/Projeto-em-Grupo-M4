package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Model.Playlist;
import com.valdisnei.valdisnei.Model.Usuario;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class BibliotecaDto {
    @OneToOne
    private Usuario usuario;
    private List<Midia> midia;
    private List<Playlist> playlist;
}
