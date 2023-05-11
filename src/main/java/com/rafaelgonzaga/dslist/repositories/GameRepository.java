package com.rafaelgonzaga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelgonzaga.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
