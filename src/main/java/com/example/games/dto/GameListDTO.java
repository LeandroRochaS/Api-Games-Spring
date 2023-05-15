package com.example.games.dto;

import com.example.games.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Data
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList gameList){
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
}
