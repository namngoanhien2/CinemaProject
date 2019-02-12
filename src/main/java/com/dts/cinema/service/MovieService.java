package com.dts.cinema.service;

import java.util.List;
import java.util.Optional;

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
	
	public TblMovie findById(int id) {
		Optional<TblMovie> movie = movieRepository.findById(id);
		if(movie.isPresent()) {
			return movie.get();
		}
		return null;
	}
	
	public BaseResponse findMovieById(int id) {
		try {
			TblMovie movie = findById(id);
			if(movie == null) {
				return null;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
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
			movie.setIdDirectors(request.getIdDirectors());
			movie.setIdActor(request.getIdActor());
			movie.setIdCinema(request.getIdCinema());
			save(movie);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public BaseResponse updateMovie(MovieRequest request) {
		try {
			TblMovie movie = findById(request.getIdMovie());
			if(movie !=null) {
				movie.setTitle(request.getTitle());
				movie.setDiscription(request.getDiscription());
				movie.setDuration(request.getDuration());
				movie.setLanguage(request.getLanguage());
				movie.setTrailler(request.getTrailler());
				movie.setVerification(request.getVerification());
				movie.setStatus(request.getStatus());
				movie.setIdCategory(request.getIdCategory());
				movie.setIdDirectors(request.getIdDirectors());
				movie.setIdActor(request.getIdActor());
				movie.setIdCinema(request.getIdCinema());
				save(movie);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
