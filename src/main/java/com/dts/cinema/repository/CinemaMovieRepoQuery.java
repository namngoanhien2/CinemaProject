package com.dts.cinema.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dts.cinema.mapping.CinemaMovieMapping;

@Repository
public class CinemaMovieRepoQuery extends baseRepository {
	public List<CinemaMovieMapping> find() {
		List<CinemaMovieMapping> CinemaMovie = null;
		String sql = "SELECT c.name , c.address , c.quantily , c.khuvuc , m.* FROM cinema c inner join movie m on c.idcinema = m.idcinema";
		Query query = this.entityManager.createNativeQuery(sql, "CinemaMovieMapping");
		CinemaMovie = query.getResultList();
		return CinemaMovie;
	}

}
