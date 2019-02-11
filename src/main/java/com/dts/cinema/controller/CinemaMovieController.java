package com.dts.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.mapping.CinemaMovieMapping;
import com.dts.cinema.service.CinemaMovieService;


@RestController
@RequestMapping(value ="/home")
public class CinemaMovieController {
	@Autowired 
	CinemaMovieService cinemaMovieService;
	
	@GetMapping(value="/find")
	public List<CinemaMovieMapping> getAllUser() {
		return cinemaMovieService.find();
	}
}
