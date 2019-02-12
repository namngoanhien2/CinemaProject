package com.dts.cinema.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CinemaRequest {
	@JsonProperty("idcinema")
	private Integer idCinema;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private String address;
	@JsonProperty("quanlity")
	private Integer quanlity;
	@JsonProperty("khuvuc")
	private String khuVuc;
}
