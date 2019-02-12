package com.dts.cinema.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieRequest {
	@JsonProperty("idmovie")
	private Integer idMovie;
	@JsonProperty("title")
	private String title;
	@JsonProperty("discription")
	private String discription;
	@JsonProperty("duration")
	private Integer duration;
	@JsonProperty("language")
	private String language;
	@JsonProperty("trailler")
	private String trailler;
	@JsonProperty("verification")
	private String verification;
	@JsonProperty("status")
	private String status;
	@JsonProperty("idcategory")
	private int idCategory;
	@JsonProperty("iddirectors")
	private int idDirectors;
	@JsonProperty("idactor")
	private int idActor;
	@JsonProperty("idcinema")
	private int idCinema;

	public MovieRequest(Integer idMovie, String title, String discription, Integer duration, String language,
			String trailler, String verification, String status, int idCategory, int idDirectors, int idActor,
			int idCinema) {
		super();
		this.idMovie = idMovie;
		this.title = title;
		this.discription = discription;
		this.duration = duration;
		this.language = language;
		this.trailler = trailler;
		this.verification = verification;
		this.status = status;
		this.idCategory = idCategory;
		this.idDirectors = idDirectors;
		this.idActor = idActor;
		this.idCinema = idCinema;
	}

}
