package com.example.games.services;

import com.example.games.dto.GameAllDTO;
import com.example.games.dto.GameDTO;
import com.example.games.dto.GameListDTO;
import com.example.games.entities.Game;
import com.example.games.projections.GameMinProjection;
import com.example.games.repositories.GameRepository;
import org.hibernate.cache.spi.entry.StructuredCacheEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameAllDTO> findAll(){
        List<GameAllDTO> gameList = (List<GameAllDTO>) gameRepository.findAll().stream().map(GameAllDTO::new).toList();
        return gameList;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Optional<Game> game = gameRepository.findById(id);
        if (((Optional<?>) game).isEmpty()) {
            throw new RuntimeException("Game not found for id: " + id);
        }
        return new GameDTO(game.get());
    }

    @Transactional(readOnly = true)
    public List<GameAllDTO> findByList(Long id){
        List<GameAllDTO> gamesList = (List<GameAllDTO>) gameRepository.searchByList(id).stream().map(GameAllDTO::new).toList();
        return gamesList;
    }

    public Boolean insert(Game game) throws SQLException {
        gameRepository.save(game);
        return true;
    }

}
