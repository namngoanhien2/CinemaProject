package com.dts.cinema.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dts.cinema.mapping.ListTicketMapping;

@Repository
public class ListTicketRepo extends baseRepository {
	@SuppressWarnings("unchecked")
	public List<ListTicketMapping> ListTickAll(Integer idticket) {
		List<ListTicketMapping> listTicketMapping = new ArrayList<>();
		String query_all_list = "SELECT t.*,s.row,s.seatno,c.name,c.address,m.title from ticket t "
				+ " inner join movie m on m.idmovie = t.idmovie " + " inner join cinema c on c.idcinema = m.idcinema "
				+ " inner join auditorium au on au.idcinema = c.idcinema "
				+ " inner join seat s on s.idauditorium = au.idauditorium " + "where s.idticket like '%"+idticket+"%'";
		Query query = this.entityManager.createNativeQuery(query_all_list, "ListTicketMapping");
		listTicketMapping = query.getResultList();
		return listTicketMapping;
	}

}
