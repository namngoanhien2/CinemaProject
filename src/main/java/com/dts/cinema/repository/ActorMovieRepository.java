package com.dts.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dts.cinema.entities.TblActor;

@Repository
public interface ActorMovieRepository extends CrudRepository<TblActor, Integer> {
	
	@Query(value = "SELECT * FROM actor "+" WHERE actor.nameactor = :nameactor", nativeQuery=true)
	  List<TblActor> findByName(@Param("nameactor") String nameactor);
}
