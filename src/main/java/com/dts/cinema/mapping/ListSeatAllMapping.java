package com.dts.cinema.mapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ListSeatAllMapping {
	private Integer idSeat;
	private String row;
	private Integer seatNo;
	private String loaiGhe;
	private Integer status;
	private Integer idAuditorium;
	private Integer idCinema;
	private String name;

	private String title;
	
	private Integer idShowTime;
	private String ngaychieu;
	private Integer giaVe;
	private Integer idMovie;
	private String gioChieu;

}
