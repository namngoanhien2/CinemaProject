package com.dts.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.entities.TblCinema;
import com.dts.cinema.request.CinemaRequest;
import com.dts.cinema.service.CinemaService;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
	@Autowired
	CinemaService cinemaService;
	
	@GetMapping(value = "/findAll")
	public List<TblCinema> getAllUser(){
		return cinemaService.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public TblCinema findById(@PathVariable("id") int id) {
		return cinemaService.findById(id);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createCinema(@RequestBody CinemaRequest request) {
		cinemaService.createCinema(request);
		return "Ok";
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCinema(@RequestBody CinemaRequest request) {
		cinemaService.updateCinema(request);
		return "Ok";
	}
	
	@DeleteMapping("/delete")
	public String deleteCinema(@RequestBody CinemaRequest request) {
		cinemaService.deleteCinema(request);
		return "Ok";
		
	}
}
