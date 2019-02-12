package com.dts.cinema.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TicketRequest {
	@JsonProperty("idticket")
	private int idTicket;
	@JsonProperty("status")
	private String status;
	@JsonProperty("idroom")
	private int idRoom;
	@JsonProperty("idcinema")
	private int idCinema;
	@JsonProperty("idmovie")
	private int idMovie;

}
