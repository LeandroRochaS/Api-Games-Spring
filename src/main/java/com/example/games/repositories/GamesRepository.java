package com.example.games.repositories;

import com.example.games.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Game, Long> {
}
