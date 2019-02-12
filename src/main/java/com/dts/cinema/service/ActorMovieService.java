package com.dts.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblActor;
import com.dts.cinema.repository.ActorMovieRepository;

@Service
public class ActorMovieService {
	@Autowired
	ActorMovieRepository actorMovieRepository;
	
	public List<TblActor> findByName(String nameactor){
		return actorMovieRepository.findByName(nameactor);
	}
	
	public List<TblActor> findByAge(String title){
		return actorMovieRepository.findByAge1(title);
	}
}

