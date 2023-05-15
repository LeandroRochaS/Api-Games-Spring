package com.example.games.dto;

import com.example.games.entities.Game;
import lombok.Data;

@Data
public class GameAllDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String  shortDescription;



    public GameAllDTO(){

    }
    public GameAllDTO(Game game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();



    }


}
