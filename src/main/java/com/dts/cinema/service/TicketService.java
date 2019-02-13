package com.dts.cinema.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblTicket;
import com.dts.cinema.mapping.ListTicketMapping;
import com.dts.cinema.repository.ListTicketRepo;
import com.dts.cinema.repository.TicketRepository;
import com.dts.cinema.request.TicketRequest;
import com.dts.cinema.response.ArrayListResponse;
import com.dts.cinema.response.BaseResponse;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;
	private ListTicketRepo listTicketRepo;

	public void save(TblTicket ticket) {
		ticketRepository.save(ticket);
	}

	private ArrayListResponse<ListTicketMapping> arrayListResponse;
	
	public BaseResponse CreateTicket(TicketRequest request) {
		TblTicket ticket = new TblTicket();
		// ticket.setIdTicket(request.getIdTicket());
		ticket.setStatus(request.getStatus());
		ticket.setIdRoom(request.getIdRoom());
		ticket.setIdMovie(request.getIdMovie());
		save(ticket);
		return null;
	}

	public ArrayListResponse<ListTicketMapping> ListTickAll(Integer idticket) {
		arrayListResponse = new ArrayListResponse<>(null);
        arrayListResponse.setRows(listTicketRepo.ListTickAll(idticket));
        arrayListResponse.setErrNumber(1);
        arrayListResponse.setMessager("List room time Success");
    
    return arrayListResponse;
	}
}