package com.valdisnei.valdisnei.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter

public class PlaylistDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


  
}
