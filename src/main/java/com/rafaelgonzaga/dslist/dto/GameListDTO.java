package com.rafaelgonzaga.dslist.dto;

import com.rafaelgonzaga.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;

	public GameListDTO() {
		super();
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
