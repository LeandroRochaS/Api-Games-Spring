package com.example.games.resources;

import com.example.games.dto.GameDTO;
import com.example.games.entities.Game;
import com.example.games.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesResource {
    @Autowired
    private GamesRepository gamesRepository;
    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> foodList = (List<GameDTO>) gamesRepository.findAll().stream().map(GameDTO::new).toList();
        return ResponseEntity.ok().body(foodList);
    }

    @PostMapping
    public void insert(@RequestBody GameDTO game){
        gamesRepository.save(new Game(game));

    }

}
