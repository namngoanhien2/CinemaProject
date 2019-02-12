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

    @GetMapping(value="/all/{title%}")
    public ArrayListResponse<ListSeatAllMapping> listAll(@PathVariable("title%") String title){
        return listSeatAllService.FindSeatByName(title);
    }
}
