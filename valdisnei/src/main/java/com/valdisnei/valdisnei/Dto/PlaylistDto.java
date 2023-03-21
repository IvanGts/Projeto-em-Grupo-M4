package com.valdisnei.valdisnei.Dto;
import com.valdisnei.valdisnei.Model.Midia;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Getter
@Setter

public class PlaylistDto {
    @JoinColumn(name = "fk_midia_id", referencedColumnName = "id")
    private Midia midia;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
