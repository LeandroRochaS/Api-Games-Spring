package com.example.games.resources;

import com.example.games.dto.GameAllDTO;
import com.example.games.dto.GameDTO;
import com.example.games.dto.GameListDTO;
import com.example.games.entities.Game;
import com.example.games.services.GameListService;
import com.example.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListResource {
    @Autowired
    private GameListService gameListService;
    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        return ResponseEntity.ok().body(gameListService.findAll());
    }

}
