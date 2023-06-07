package com.valdisnei.imagebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdisnei.imagebank.models.MidiaImage;

public interface MidiaImageRepository extends JpaRepository <MidiaImage, Long> {
    
}
