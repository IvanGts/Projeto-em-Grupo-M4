package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.*;
import com.valdisnei.valdisnei.Model.Artista;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Model.Playlist;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlaylistBo {
    public Playlist parseToEntity(PlaylistDto dto, Playlist pEntity){
        if (pEntity == null)
            pEntity = new Playlist();

        if (dto == null)
            return pEntity;

        pEntity.setBiblioteca(dto.getBiblioteca());
        List<Midia> midias = new ArrayList<>();
//        for( Midia midia : dto.getMidia()){
//            MidiaDto mDto = new MidiaDto();
//            midia.setAno(mDto.getAno());
//            midia.setTitulo(mDto.getTitulo());
//            midia.setGenero(mDto.getGenero());
//            if (midia.getFilme()!=null){
//                //Todo
//                FilmeDto fDto = new FilmeDto();
//                fDto.setDiretor(midia.getFilme().getDiretor());
//                fDto.setElenco(midia.getFilme().getElenco());
//            }
//            if (midia.getMusica()!=null){
//                //Todo
//            }
//            midias.add(midia);
//        }

        return pEntity;
    }
}
