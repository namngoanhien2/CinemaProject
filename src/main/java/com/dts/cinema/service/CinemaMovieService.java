package com.dts.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.mapping.CinemaMovieMapping;
import com.dts.cinema.repository.CinemaMovieRepoQuery;

@Service
public class CinemaMovieService {
	@Autowired
	CinemaMovieRepoQuery cinemaMovieRepoQuery;
	
	public List<CinemaMovieMapping> find(){
		return cinemaMovieRepoQuery.find();
	}
}
