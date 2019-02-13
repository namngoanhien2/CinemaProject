package com.dts.cinema.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TicketRequest {
	@JsonProperty("idticket")
	private int idTicket;
	@JsonProperty("status")
	private String status;
	@JsonProperty("idauditorium")
	private int idRoom;
	@JsonProperty("idmovie")
	private int idMovie;

}
