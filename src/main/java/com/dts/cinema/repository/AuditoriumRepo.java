package com.dts.cinema.repository;

import org.springframework.data.repository.CrudRepository;

import com.dts.cinema.entities.TblAuditorium;

public interface AuditoriumRepo extends CrudRepository<TblAuditorium, Integer>{
	
}
