package com.dts.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblTicket;
import com.dts.cinema.repository.TicketRepository;
import com.dts.cinema.request.TicketRequest;
import com.dts.cinema.response.BaseResponse;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	public void save(TblTicket ticket) {
		ticketRepository.save(ticket);
	}

	public BaseResponse CreateTicket(TicketRequest request) {
		TblTicket ticket = new TblTicket();
		// ticket.setIdTicket(request.getIdTicket());
		ticket.setStatus(request.getStatus());
		ticket.setIdRoom(request.getIdRoom());
		ticket.setIdCinema(request.getIdCinema());
		ticket.setIdMovie(request.getIdMovie());
		save(ticket);
		return null;
	}
}