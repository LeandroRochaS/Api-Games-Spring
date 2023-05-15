package com.example.games.resources;

import com.example.games.dto.GameAllDTO;
import com.example.games.dto.GameDTO;
import com.example.games.entities.Game;
import com.example.games.repositories.GameRepository;
import com.example.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesResource {
    @Autowired
    private GameService gameService;
    @GetMapping
    public ResponseEntity<List<GameAllDTO>> findAll(){
        return ResponseEntity.ok().body(gameService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(gameService.findById(id));
    }

    @PostMapping
    public void insert(@RequestBody Game game) throws SQLException {
        boolean insert = gameService.insert(game);
        if(insert) ResponseEntity.noContent();

    }

}
