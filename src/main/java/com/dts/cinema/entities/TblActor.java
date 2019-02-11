package com.dts.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "actor")
@Getter
@Setter
@ToString

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

	public TblActor(int idActor, String nameActor, int age, int sex) {
		super();
		this.idActor = idActor;
		this.nameActor = nameActor;
		this.age = age;
		this.sex = sex;
	}
}
