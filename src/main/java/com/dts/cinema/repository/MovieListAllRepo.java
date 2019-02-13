package com.dts.cinema.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dts.cinema.mapping.MovieCinemaActorDirectorMapping;

@Repository
public class MovieListAllRepo extends baseRepository {
	public List<MovieCinemaActorDirectorMapping> listMovieAll(String title){
		List<MovieCinemaActorDirectorMapping> listMovieAll = new ArrayList<>();
		String query_movie_all = "SELECT m.title, m.discription, m.duration, m.language, m.verification, m.trailler, a.nameactor, d.namedirectors, c.type" + 
				" from movie m inner join actor a on a.idactor = m.idactor" + 
				" inner join category  c on c.idcategory = m.idcategory" + 
				" inner join directors d on m.iddirectors = d.iddirectors" + 
				" where m.title like '%"+title+"%'";
		Query query = this.entityManager.createNativeQuery(query_movie_all, "MovieCinemaActorDirectorMapping");
		listMovieAll = query.getResultList();
		return listMovieAll;
	}
}
