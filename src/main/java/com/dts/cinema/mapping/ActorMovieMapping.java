package com.dts.cinema.mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ActorMovieMapping {
	private String nameActor;
	private int age;
	private int sex;
	private Integer idMovie;
	private String title;
	private String discription;
	private Integer duration;
	private String language;
	private String trailler;
	private String verification;
	private String status;
	private int idCategory;
	private int idDirectors;
	private int idActor;
	private int idCinema;

	public ActorMovieMapping(String nameActor, int age, int sex, Integer idMovie, String title, String discription,
			Integer duration, String language, String trailler, String verification, String status, int idCategory,
			int idDirectors, int idActor, int idCinema) {
		super();
		this.nameActor = nameActor;
		this.age = age;
		this.sex = sex;
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
