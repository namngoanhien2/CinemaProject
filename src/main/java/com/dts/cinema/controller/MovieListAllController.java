package com.dts.cinema.controller;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.mapping.MovieCinemaActorDirectorMapping;
import com.dts.cinema.response.ArrayListResponse;
import com.dts.cinema.service.MovieAllService;
import com.dts.cinema.service.MovieService;

@RestController
@RequestMapping("/listAllMovie")
public class MovieListAllController {
	@Autowired
	private MovieAllService movieAllService;
	
	@GetMapping(value = "/listmovie/{title}")
	public ArrayListResponse<MovieCinemaActorDirectorMapping> listMovieAll(@PathVariable String title) {
		return movieAllService.listMovieAll(title);
	}
}
