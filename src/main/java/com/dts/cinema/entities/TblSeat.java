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
@Table(name = "seat")
@Getter
@Setter
@ToString

public class TblSeat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idseat")
	private int idSeat;
	@Column(name = "row")
	private String row;
	@Column(name = "seatno")
	private int seatNo;
	@Column(name = "loaighe")
	private String loaiGhe;
	@Column(name = "status")
	private int status;
	@Column(name = "idauditorium")
	private int idAuditorium;

	public TblSeat(int idSeat, String row, int seatNo, String loaiGhe, int status, int idAuditorium) {
		super();
		this.idSeat = idSeat;
		this.row = row;
		this.seatNo = seatNo;
		this.loaiGhe = loaiGhe;
		this.status = status;
		this.idAuditorium = idAuditorium;
	}

}
