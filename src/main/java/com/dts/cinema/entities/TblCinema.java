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

import com.dts.cinema.mapping.CinemaMovieMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cinema")
@Getter
@Setter
@ToString
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "CinemaMovieMapping",
                classes = @ConstructorResult(
                        targetClass = CinemaMovieMapping.class,
                        columns = {
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "address", type = String.class),
                                @ColumnResult(name = "quantily", type = Integer.class),
                                @ColumnResult(name = "khuvuc", type = String.class),
                                @ColumnResult(name = "idmovie", type = Integer.class),
                                @ColumnResult(name = "title", type = String.class),
                                @ColumnResult(name = "discription", type = String.class),
                                @ColumnResult(name = "duration", type = Integer.class),
                                @ColumnResult(name = "language", type = String.class),
                                @ColumnResult(name = "trailler", type = String.class),
                                @ColumnResult(name = "verification", type = String.class),
                                @ColumnResult(name = "status", type = String.class),
                                @ColumnResult(name = "idcategory", type = Integer.class),
                                @ColumnResult(name = "iddirectors", type = Integer.class),
                                @ColumnResult(name = "idactor", type = Integer.class),
                                @ColumnResult(name = "idcinema", type = Integer.class)
                        }
                )
        )
)
public class TblCinema {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idcinema")
	private Integer idCinema;
	@Column(name ="name")
	private String name;
	@Column(name ="address")
	private String address;
	@Column(name ="quantily")
	private Integer quanlity;
	@Column(name ="khuvuc")
	private String khuVuc;

	public TblCinema(Integer idCinema, String name, String address, Integer quanlity, String khuVuc) {
		super();
		this.idCinema = idCinema;
		this.name = name;
		this.address = address;
		this.quanlity = quanlity;
		this.khuVuc = khuVuc;
	}

}
