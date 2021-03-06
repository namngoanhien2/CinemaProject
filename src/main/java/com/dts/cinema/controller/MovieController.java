package com.dts.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.entities.TblMovie;
import com.dts.cinema.request.MovieRequest;
import com.dts.cinema.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping(value = "/listAll")
	public List<TblMovie> findAll() {
		return movieService.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public TblMovie findById(@PathVariable int id) {
		return movieService.findById(id);
	}
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String creatMovie(@RequestBody MovieRequest request) {
		movieService.createMovie(request);
		return "Ok";
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateMovie(@RequestBody MovieRequest request) {
		movieService.updateMovie(request);
		return "Ok";
	}
}
