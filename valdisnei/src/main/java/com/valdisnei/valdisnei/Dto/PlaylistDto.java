package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Midia;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlaylistDto {


    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
    private Midia midia;

}
