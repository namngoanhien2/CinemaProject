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
@Table(name = "showtime")
@Getter
@Setter
@ToString
public class TblShowTime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idshowtime")
	private int idShowTime;
	@Column(name = "ngaychieu")
	private String ngaychieu;
	@Column(name = "giave")
	private int giaVe;
	@Column(name = "idmovie")
	private int idMovie;
	@Column(name = "idframetime")
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
