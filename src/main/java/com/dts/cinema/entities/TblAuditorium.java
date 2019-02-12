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

import com.dts.cinema.mapping.ListSeatAllMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "auditorium")
@Getter
@Setter
@ToString
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "ListSeatAllMapping",
                classes = @ConstructorResult(
                        targetClass = ListSeatAllMapping.class,
                        columns = {
                                @ColumnResult(name = "idseat", type = Integer.class),
                                @ColumnResult(name = "row", type = String.class),
                                @ColumnResult(name = "seatno", type = Integer.class),
                                @ColumnResult(name = "loaighe", type = String.class),
                                @ColumnResult(name = "status", type = Integer.class),
                                @ColumnResult(name = "idauditorium", type = Integer.class),
                                @ColumnResult(name = "idcinema", type = Integer.class),
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "title", type = String.class),
                                @ColumnResult(name = "idshowtime", type = Integer.class),
                                @ColumnResult(name = "ngaychieu", type = String.class),
                                @ColumnResult(name = "giave", type = Integer.class),
                                @ColumnResult(name = "idmovie", type = Integer.class),
                                @ColumnResult(name = "giochieu", type = String.class)
                        }
                )
        )
)

public class TblAuditorium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idauditorium")
	private int idAuditorium;
	@Column(name = "name")
	private String name;
	@Column(name = "technology")
	private String technology;
	@Column(name = "seetno" )
	private String seetNo;
	@Column(name = "status")
	private int status;
	@Column(name = "idcinema")
	private int idCinema;

	public TblAuditorium(int idAuditorium, String name, String technology, String seetNo, int status, int idCinema) {
		super();
		this.idAuditorium = idAuditorium;
		this.name = name;
		this.technology = technology;
		this.seetNo = seetNo;
		this.status = status;
		this.idCinema = idCinema;
	}

}
