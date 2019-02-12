package com.dts.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dts.cinema.entities.TblMovie;

public interface MovieRepository extends JpaRepository<TblMovie, Integer>{

}
