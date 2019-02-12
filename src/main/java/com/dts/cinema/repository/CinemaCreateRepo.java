package com.dts.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dts.cinema.entities.TblCinema;

public interface CinemaCreateRepo extends JpaRepository<TblCinema, Integer>{

}
