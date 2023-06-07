package com.valdisnei.imagebank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdisnei.imagebank.models.MidiaImage;
import com.valdisnei.imagebank.repositories.MidiaImageRepository;

@RequestMapping("midiaimgs")
@RestController
public class MidiaImageController {
    @Autowired
    private MidiaImageRepository midiaImageRepository;
    
    @GetMapping("/todasImgs")
    public List<MidiaImage> mostrarTodasImagens() {
        return midiaImageRepository.findAll();
    }

    @GetMapping("/{tipoMidia}/{id}")
    public String mostrarUrlDe(@PathVariable int id, @PathVariable String tipoMidia) {
        MidiaImage midiaImage = midiaImageRepository.findAll().stream()
        .filter(image -> id == image.getIdMidia() && 
            tipoMidia.toUpperCase().equals(image.getTipoMidia().toString()))
        .findAny().orElse(null);
        return midiaImage.getUrlPath();
    }
}
