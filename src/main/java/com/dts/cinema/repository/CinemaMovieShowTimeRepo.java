package com.dts.cinema.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dts.cinema.mapping.CinemaMoVieShowTimeMapping;

@Repository
public class CinemaMovieShowTimeRepo extends baseRepository {

	@SuppressWarnings("unchecked")
	public List<CinemaMoVieShowTimeMapping> SortByName(String title) {
		List<CinemaMoVieShowTimeMapping> cinemaMoVieShowTimeMapping = null;
		String query_all = "SELECT c.*, m.idmovie ,m.title,m.discription,m.duration,s.idshowtime,s.ngaychieu,s.giave FROM cenima.cinema c inner join cenima.movie m on c.idcinema = m.idcinema inner join cenima.showtime s on m.idmovie = s.idmovie "
				+ "WHERE (m.title like '%All%')";
		Query query = this.entityManager.createNativeQuery(query_all, "CinemaMoVieShowTimeMapping");
		query.setParameter("title", title);
		cinemaMoVieShowTimeMapping = query.getResultList();
		return cinemaMoVieShowTimeMapping;
	}
}
