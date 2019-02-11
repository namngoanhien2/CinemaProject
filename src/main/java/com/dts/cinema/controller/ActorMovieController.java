package com.dts.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.entities.TblActor;
import com.dts.cinema.service.ActorMovieService;

@RestController
@RequestMapping(value = "/movie")
public class ActorMovieController {
	@Autowired
	ActorMovieService actorMovieService;

	@GetMapping(value = "/{nameactor}")
	public List<TblActor> getByName(@PathVariable(value = "nameactor") String nameactor) {
		return actorMovieService.findByName(nameactor);
	}
}
