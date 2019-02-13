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

import com.dts.cinema.mapping.ListTicketMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@ToString
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "ListTicketMapping",
                classes = @ConstructorResult(
                        targetClass = ListTicketMapping.class,
                        columns = {
                                @ColumnResult(name = "idticket", type = Integer.class),
                                @ColumnResult(name = "status", type = String.class),
                                @ColumnResult(name = "idauditorium", type = Integer.class),
                                @ColumnResult(name = "idmovie", type = Integer.class),
                                @ColumnResult(name = "row", type = String.class),
                                @ColumnResult(name = "seatno", type = Integer.class),
                                @ColumnResult(name = "name", type = String.class),
                                @ColumnResult(name = "address", type = String.class),
                                @ColumnResult(name = "title", type = String.class)
                        }
                )
        )
)

public class TblTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idticket")
	private int idTicket;
	@Column(name = "status")
	private String status;
	@Column(name = "idauditorium")
	private int idRoom;
	@Column(name = "idmovie")
	private int idMovie;

	public TblTicket(int idTicket, String status, int idRoom, int idMovie) {
		super();
		this.idTicket = idTicket;
		this.status = status;
		this.idRoom = idRoom;
		this.idMovie = idMovie;
	}

	public TblTicket() {
		super();
	}
	
	

}
