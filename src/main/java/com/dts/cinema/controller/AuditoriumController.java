package com.dts.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.cinema.entities.TblAuditorium;
import com.dts.cinema.request.AuditoriumRequest;
import com.dts.cinema.response.BaseResponse;
import com.dts.cinema.service.AuditoriumService;
;

@RestController
@RequestMapping("/auditorium")
public class AuditoriumController {
	@Autowired
	private AuditoriumService auditoriumService;
	
	@GetMapping(value = "/findAll")
	public List<TblAuditorium> findALl(){
		return auditoriumService.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public TblAuditorium findById(@PathVariable("id") int id){
		return auditoriumService.findById(id);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAuditorium(@RequestBody AuditoriumRequest request) {
		auditoriumService.createAuditorium(request);
		return "OK";
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAuditorium(@RequestBody AuditoriumRequest request) {
		auditoriumService.updateAuditorium(request);
		return "OK";
	}
}
