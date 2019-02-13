package com.dts.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.mapping.MovieCinemaActorDirectorMapping;
import com.dts.cinema.repository.MovieListAllRepo;
import com.dts.cinema.response.ArrayListResponse;

@Service
public class MovieAllService {
	@Autowired 
	private MovieListAllRepo movieListAllRepo;
	
	private ArrayListResponse<MovieCinemaActorDirectorMapping> arrayListResponse;
	
	public ArrayListResponse<MovieCinemaActorDirectorMapping> listMovieAll(String title){
		arrayListResponse = new ArrayListResponse<>(null);
		arrayListResponse.setRows(movieListAllRepo.listMovieAll(title));
		arrayListResponse.setErrNumber(1);
		arrayListResponse.setMessager("Sucess");
		return arrayListResponse;
	}
	
}
