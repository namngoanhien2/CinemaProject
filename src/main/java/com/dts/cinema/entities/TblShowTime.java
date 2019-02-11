package com.dts.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "showtime")
@Getter
@Setter
@ToString
public class TblShowTime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idShowTime;
	private String ngaychieu;
	private int giaVe;
	private int idMovie;
	private int idFrameTime;

	public TblShowTime(int idShowTime, String ngaychieu, int giaVe, int idMovie, int idFrameTime) {
		super();
		this.idShowTime = idShowTime;
		this.ngaychieu = ngaychieu;
		this.giaVe = giaVe;
		this.idMovie = idMovie;
		this.idFrameTime = idFrameTime;
	}

}
