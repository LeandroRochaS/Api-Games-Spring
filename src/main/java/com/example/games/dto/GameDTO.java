package com.example.games.dto;

import com.example.games.entities.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

@Data
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String  shortDescription;
    private String longDescription;
    private String platforms;
    private String genre;
    private Double score;


    public GameDTO() {
    }
    public GameDTO(Game game){
        BeanUtils.copyProperties(game, this);



    }



}
