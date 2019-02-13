package com.dts.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.mapping.ListSeatAllMapping;
import com.dts.cinema.response.ArrayListResponse;
import com.dts.cinema.service.ListSeatAllService;

@RestController
@RequestMapping("/list")
public class ListSeatAllController {
	@Autowired
	private ListSeatAllService listSeatAllService;

    @GetMapping(value="/namemovie/{title}")
    public ArrayListResponse<ListSeatAllMapping> BookByNameMovie(@PathVariable("title") String title){
        return listSeatAllService.FindSeatByName(title);
    }
    
    @GetMapping(value="/namecinema/{namecinema}")
    public ArrayListResponse<ListSeatAllMapping> BockByCinema(@PathVariable("namecinema") String namecinema){
        return listSeatAllService.FindSeatBycinema(namecinema);
    }
    
    @GetMapping(value="/time/{namecinema}/{namemovie}/{time}")
    public ArrayListResponse<ListSeatAllMapping> BockByTimeAndMovie(@PathVariable("namecinema") String namecinema,@PathVariable("namemovie") String namemovie,@PathVariable("time") String time){
        return listSeatAllService.FindSeatByTime(namecinema,namemovie,time);
    }
    
}
