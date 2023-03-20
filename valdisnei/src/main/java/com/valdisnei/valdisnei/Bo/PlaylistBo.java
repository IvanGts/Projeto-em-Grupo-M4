package com.valdisnei.valdisnei.Bo;

import com.valdisnei.valdisnei.Dto.PlaylistDto;
import com.valdisnei.valdisnei.Model.Playlist;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class PlaylistBo {
    public Playlist parseToEntity(PlaylistDto dto, Playlist pEntity){
        if (pEntity == null)
            pEntity = new Playlist();

        if (dto == null)
            return pEntity;

        pEntity.setMidia(dto.getMidia());
        return pEntity;

    }
}
