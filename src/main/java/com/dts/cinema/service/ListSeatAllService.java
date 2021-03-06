package com.dts.cinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.mapping.ListSeatAllMapping;
import com.dts.cinema.repository.ListSeatAllRepo;
import com.dts.cinema.response.ArrayListResponse;

@Service
public class ListSeatAllService {
	@Autowired
	private ListSeatAllRepo listSeatAllRepo;
	
	private ArrayListResponse<ListSeatAllMapping> arrayListResponse;
	
	public ArrayListResponse<ListSeatAllMapping> FindSeatByName(String title) {
     
        	arrayListResponse = new ArrayListResponse<>(null);
            arrayListResponse.setRows(listSeatAllRepo.FindSeatByName(title));
            arrayListResponse.setErrNumber(1);
            arrayListResponse.setMessager("List room time Success");
        
        return arrayListResponse;
    }

	public ArrayListResponse<ListSeatAllMapping> FindSeatBycinema(String namecinema) {
		arrayListResponse = new ArrayListResponse<>(null);
        arrayListResponse.setRows(listSeatAllRepo.FindSeatBycinema(namecinema));
        arrayListResponse.setErrNumber(1);
        arrayListResponse.setMessager("List room time Success");
    
    return arrayListResponse;
	}

	public ArrayListResponse<ListSeatAllMapping> FindSeatByTime(String namecinema, String namemovie, String time) {
		arrayListResponse = new ArrayListResponse<>(null);
        arrayListResponse.setRows(listSeatAllRepo.FindSeatByTime(namecinema,namemovie,time));
        arrayListResponse.setErrNumber(1);
        arrayListResponse.setMessager("List room time Success");
    
    return arrayListResponse;
	}


}
