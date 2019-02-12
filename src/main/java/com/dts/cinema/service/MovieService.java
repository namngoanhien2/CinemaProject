package com.dts.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblMovie;
import com.dts.cinema.repository.MovieRepository;
import com.dts.cinema.request.MovieRequest;
import com.dts.cinema.response.BaseResponse;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;

	public List<TblMovie> findAll() {
		return movieRepository.findAll();
	}

	public void save(TblMovie movie) {
		movieRepository.save(movie);
	}

	public BaseResponse createMovie(MovieRequest request) {
		try {
			TblMovie movie = new TblMovie();
			movie.setTitle(request.getTitle());
			movie.setDiscription(request.getDiscription());
			movie.setDuration(request.getDuration());
			movie.setLanguage(request.getLanguage());
			movie.setTrailler(request.getTrailler());
			movie.setVerification(request.getVerification());
			movie.setStatus(request.getStatus());
			movie.setIdCategory(request.getIdCategory());
			System.out.println(request.getIdCategory());
			movie.setIdDirectors(request.getIdDirectors());
			System.out.println(request.getIdDirectors());
			movie.setIdActor(request.getIdActor());
			System.out.println(request.getIdActor());
			movie.setIdCinema(request.getIdCinema());
			System.out.println(request.getIdMovie());
			save(movie);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
