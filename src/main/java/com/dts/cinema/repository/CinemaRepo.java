package com.dts.cinema.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dts.cinema.entities.TblCinema;
@Repository
public interface CinemaRepo extends CrudRepository<TblCinema, Integer>{
	@Query(value = "select * from cinema c where c.name like %:name%", nativeQuery=true)
	List<TblCinema> lisCinema(@Param("name") String name);
}
