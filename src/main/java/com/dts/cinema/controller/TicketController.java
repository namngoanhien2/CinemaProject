package com.dts.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.request.TicketRequest;
import com.dts.cinema.service.TicketService;

@RestController
@RequestMapping(value ="/all")
public class TicketController {
	@Autowired 
	private TicketService ticketService;
	
	@PostMapping(value = "/create")
	public String createTicket(@RequestBody TicketRequest request) {
		ticketService.CreateTicket(request);
		return "Ok";
	}
}
