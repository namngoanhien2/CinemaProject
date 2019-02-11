package com.dts.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.mapping.CinemaMoVieShowTimeMapping;
import com.dts.cinema.repository.CinemaMovieShowTimeRepo;
import com.dts.cinema.response.ArrayListResponse;

@Service
public class CinemaMovieShowTimeService {
	@Autowired
	private CinemaMovieShowTimeRepo cinemaMovieShowTimeRepo;
	
	private ArrayListResponse<CinemaMoVieShowTimeMapping> arrayListResponse;
	
	public ArrayListResponse<CinemaMoVieShowTimeMapping> SortByNames(String title) {
        try {
            arrayListResponse.setRows(cinemaMovieShowTimeRepo.SortByName(title));
            arrayListResponse.setErrNumber(1);
            arrayListResponse.setMessager("List room time Success");
        } catch (Exception e) {

        }
        return arrayListResponse;
    }
}
