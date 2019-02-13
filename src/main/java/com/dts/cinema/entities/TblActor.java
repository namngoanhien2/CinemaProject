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
import com.dts.cinema.mapping.MovieCinemaActorDirectorMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "actor")
@Getter
@Setter
@ToString
@AllArgsConstructor
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "MovieCinemaActorDirectorMapping",
                classes = @ConstructorResult(
                        targetClass = MovieCinemaActorDirectorMapping.class,
                        columns = {
                                @ColumnResult(name = "title", type = String.class),
                                @ColumnResult(name = "discription", type = String.class),
                                @ColumnResult(name = "duration", type = Integer.class),
                                @ColumnResult(name = "language", type = String.class),
                                @ColumnResult(name = "verification", type = String.class),
                                @ColumnResult(name = "trailler", type = String.class),
                                @ColumnResult(name = "nameactor", type = String.class),
                                @ColumnResult(name = "namedirectors", type = String.class),
                                @ColumnResult(name = "type", type = String.class),                                
                        }
                )
        )
)
public class TblActor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idactor")

	private int idActor;
	@Column(name = "nameactor")
	private String nameActor;
	@Column(name = "ageactor")
	private int age;
	@Column(name = "sexactor")
	private int sex;
	public TblActor() {
		super();
	}

	
}
