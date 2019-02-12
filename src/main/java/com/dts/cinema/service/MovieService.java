package com.dts.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblMovie;
import com.dts.cinema.repository.MovieRepository;
import com.dts.cinema.response.BaseResponse;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public List<TblMovie> findAll(){
		return movieRepository.findAll();
	}
	
}
