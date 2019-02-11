package com.dts.cinema.mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CinemaMoVieShowTimeMapping {
	private Integer idCinema;
	private String name;
	private String address;
	private int quanlity;
	private String khuVuc;

	private int idMovie;
	private String title;
	private String discription;
	private int duration;

	private int idShowTime;
	private String ngayChieu;
	private int giaVe;

	public CinemaMoVieShowTimeMapping(Integer idCinema, String name, String address, int quanlity, String khuVuc,
			int idMovie, String title, String discription, int duration, int idShowTime, String ngayChieu, int giaVe) {
		super();
		this.idCinema = idCinema;
		this.name = name;
		this.address = address;
		this.quanlity = quanlity;
		this.khuVuc = khuVuc;
		this.idMovie = idMovie;
		this.title = title;
		this.discription = discription;
		this.duration = duration;
		this.idShowTime = idShowTime;
		this.ngayChieu = ngayChieu;
		this.giaVe = giaVe;
	}

}
