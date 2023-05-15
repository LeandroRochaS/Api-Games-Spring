package com.example.games.repositories;

import com.example.games.entities.Game;
import com.example.games.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
