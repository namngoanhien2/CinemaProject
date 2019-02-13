package com.dts.cinema.mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListTicketMapping {
	private int idTicket;
	private String status;
	private int idRoom;
	private int idMovie;

	private String row;
	private int seatNo;

	private String name;
	private String address;

	private String title;

	public ListTicketMapping(int idTicket, String status, int idRoom, int idMovie, String row, int seatNo, String name,
			String address, String title) {
		super();
		this.idTicket = idTicket;
		this.status = status;
		this.idRoom = idRoom;
		this.idMovie = idMovie;
		this.row = row;
		this.seatNo = seatNo;
		this.name = name;
		this.address = address;
		this.title = title;
	}

}
