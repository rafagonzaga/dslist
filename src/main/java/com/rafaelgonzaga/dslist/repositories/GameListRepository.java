package com.rafaelgonzaga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelgonzaga.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
