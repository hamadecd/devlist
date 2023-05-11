package com.devhamade.devlist.services;

import com.devhamade.devlist.dto.GameListDTO;
import com.devhamade.devlist.entities.GameList;
import com.devhamade.devlist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(game -> new GameListDTO(game)).toList();
    }

}
