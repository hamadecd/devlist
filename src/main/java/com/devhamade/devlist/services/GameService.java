package com.devhamade.devlist.services;

import com.devhamade.devlist.dto.GameMinDTO;
import com.devhamade.devlist.entities.Game;
import com.devhamade.devlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }

}
