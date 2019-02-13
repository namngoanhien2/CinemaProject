package com.dts.cinema.mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieCinemaActorDirectorMapping {
	private String title;
	private String discription;
	private Integer duration;
	private String language;
	private String verification;
	private String traller;
	private String nameactor;
	private String namedirectors;
	private String type;
	
	public MovieCinemaActorDirectorMapping() {
		super();
	}

	public MovieCinemaActorDirectorMapping(String title, String discription, Integer duration, String language,
			String verification, String traller, String nameactor, String namedirectors, String type) {
		super();
		this.title = title;
		this.discription = discription;
		this.duration = duration;
		this.language = language;
		this.verification = verification;
		this.traller = traller;
		this.nameactor = nameactor;
		this.namedirectors = namedirectors;
		this.type = type;
	}

}
