package com.example.games.services;

import com.example.games.dto.GameAllDTO;
import com.example.games.dto.GameDTO;
import com.example.games.dto.GameListDTO;
import com.example.games.entities.Game;
import com.example.games.repositories.GameListRepository;
import com.example.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameListDTO> gameList = (List<GameListDTO>) gameListRepository.findAll().stream().map(GameListDTO::new).toList();
        return gameList;
    }

}
