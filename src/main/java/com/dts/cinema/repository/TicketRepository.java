package com.dts.cinema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dts.cinema.entities.TblTicket;

@Repository
public interface TicketRepository extends CrudRepository<TblTicket, Integer> {
	
}
