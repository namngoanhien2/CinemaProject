package com.dts.cinema.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AuditoriumRequest {
	@JsonProperty("idauditorium")
	private int idAuditorium;
	@JsonProperty("name")
	private String name;
	@JsonProperty("technology")
	private String technology;
	@JsonProperty("seetno" )
	private String seetNo;
	@JsonProperty("status")
	private int status;
	@JsonProperty("idcinema")
	private int idCinema;
	
	public AuditoriumRequest(int idAuditorium, String name, String technology, String seetNo, int status,
			int idCinema) {
		super();
		this.idAuditorium = idAuditorium;
		this.name = name;
		this.technology = technology;
		this.seetNo = seetNo;
		this.status = status;
		this.idCinema = idCinema;
	}
	
	
}
