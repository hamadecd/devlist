package com.devhamade.devlist.repositories;

import com.devhamade.devlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
