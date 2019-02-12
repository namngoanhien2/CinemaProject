package com.dts.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@ToString
public class TblTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idticket")
	private int idTicket;
	@Column(name = "status")
	private String status;
	@Column(name = "idroom")
	private int idRoom;
	@Column(name = "idcinema")
	private int idCinema;
	@Column(name = "idmovie")
	private int idMovie;

	public TblTicket(int idTicket, String status, int idRoom, int idCinema, int idMovie) {
		super();
		this.idTicket = idTicket;
		this.status = status;
		this.idRoom = idRoom;
		this.idCinema = idCinema;
		this.idMovie = idMovie;
	}

	public TblTicket() {
		super();
	}
	
	

}
