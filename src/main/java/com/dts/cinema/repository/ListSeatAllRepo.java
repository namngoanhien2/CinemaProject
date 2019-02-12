package com.dts.cinema.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dts.cinema.mapping.ListSeatAllMapping;

@Repository
public class ListSeatAllRepo extends baseRepository {
	@SuppressWarnings("unchecked")
	public List<ListSeatAllMapping> FindSeatByName(String title) {
		List<ListSeatAllMapping> listSeatAllMapping = new ArrayList<>();
		String query_all_list_seat = "SELECT s.*,c.idcinema,c.name, m.title , sh.* from seat s "
				+ " inner join auditorium a on a.idauditorium = s.idauditorium "
				+ " inner join cinema c on c.idcinema = a.idcinema " + " inner join movie m on m.idcinema = c.idcinema "
				+ " inner join showtime sh on sh.idmovie = m.idmovie " + "WHERE m.title like";
		Query query = this.entityManager.createNativeQuery(query_all_list_seat+":title%", "ListSeatAllMapping");
		query.setParameter("title%", title);
		listSeatAllMapping = query.getResultList();
		return listSeatAllMapping;
	}
}
