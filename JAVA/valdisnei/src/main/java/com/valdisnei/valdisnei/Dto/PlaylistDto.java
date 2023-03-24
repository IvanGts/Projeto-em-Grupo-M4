package com.valdisnei.valdisnei.Dto;

import com.valdisnei.valdisnei.Model.Biblioteca;
import com.valdisnei.valdisnei.Model.Midia;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PlaylistDto {

    private Biblioteca biblioteca;
    @Nullable
    private List<Midia> midia;
}
