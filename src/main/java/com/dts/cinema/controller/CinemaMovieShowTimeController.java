package com.dts.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.mapping.CinemaMoVieShowTimeMapping;
import com.dts.cinema.response.ArrayListResponse;
import com.dts.cinema.service.CinemaMovieShowTimeService;

@RestController
@RequestMapping("/sort")
public class CinemaMovieShowTimeController {
	@Autowired
	CinemaMovieShowTimeService cinemaMovieShowTimeService;

    @GetMapping("/all/{title}")
    public ArrayListResponse<CinemaMoVieShowTimeMapping> listAll(@PathVariable("title") String title){
        return cinemaMovieShowTimeService.SortByNames(title);
    }
}
