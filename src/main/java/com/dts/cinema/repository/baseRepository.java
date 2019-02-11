package com.dts.cinema.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class baseRepository {

	@Autowired
	protected EntityManager entityManager;
}
