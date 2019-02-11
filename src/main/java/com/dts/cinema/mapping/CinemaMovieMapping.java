package com.dts.cinema.mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CinemaMovieMapping {
	private String name;
	private String address;
	private int quanlity;
	private String khuVuc;
	private int idMovie;
	private String title;
	private String discription;
	private int duration;
	private String language;
	private String trailler;
	private String verification;
	private String status;
	private int idCategory;
	private int idDirectors;
	private int idActor;
	private int idCinema;

	public CinemaMovieMapping(String name, String address, int quanlity, String khuVuc, int idMovie, String title,
			String discription, int duration, String language, String trailler, String verification, String status,
			int idCategory, int idDirectors, int idActor, int idCinema) {
		super();
		this.name = name;
		this.address = address;
		this.quanlity = quanlity;
		this.khuVuc = khuVuc;
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
