package com.dts.cinema.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.dts.cinema.mapping.CinemaMoVieShowTimeMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "movie")
@Getter
@Setter
@ToString
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "CinemaMoVieShowTimeMapping",
                classes = @ConstructorResult(
                        targetClass = CinemaMoVieShowTimeMapping.class,
                        columns = {
                                @ColumnResult(name = "idcinema", type = Integer.class),
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "address", type = String.class),
                                @ColumnResult(name = "quantily", type = Integer.class),
                                @ColumnResult(name = "khuvuc", type = String.class),
                                @ColumnResult(name = "idmovie", type = Integer.class),
                                @ColumnResult(name = "title", type = String.class),
                                @ColumnResult(name = "discription", type = String.class),
                                @ColumnResult(name = "duration", type = Integer.class),
                                @ColumnResult(name = "idshowtime", type = Integer.class),
                                @ColumnResult(name = "ngaychieu", type = String.class),
                                @ColumnResult(name = "giave", type = Integer.class),
                        }
                )
        )
)
public class TblMovie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idmovie")
	private Integer idMovie;
	@Column(name ="title")
	private String title;
	@Column(name = "discription")
	private String discription;
	@Column(name = "duration")
	private Integer duration;
	@Column(name = "language")
	private String language;
	@Column(name = "trailler")
	private String trailler;
	@Column(name = "verification")
	private String verification;
	@Column(name = "status")
	private String status;
	@Column(name = "idcategory")
	private int idCategory;
	@Column(name = "iddirectors")
	private int idDirectors;
	@Column(name = "idactor")
	private int idActor;
	@Column(name = "idcinema")
	private int idCinema;

	public TblMovie(Integer idMovie, String title, String discription, Integer duration, String language,
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
