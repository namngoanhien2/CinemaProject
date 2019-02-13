package com.dts.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblAuditorium;
import com.dts.cinema.repository.AuditoriumRepo;
import com.dts.cinema.request.AuditoriumRequest;
import com.dts.cinema.response.BaseResponse;


@Service
public class AuditoriumService {
	@Autowired
	private AuditoriumRepo auditoriumRepo;
	
	public void save(TblAuditorium auditorium) {
		auditoriumRepo.save(auditorium);
	}

	public List<TblAuditorium> findAll() {
		return (List<TblAuditorium>) auditoriumRepo.findAll();
	}

	public TblAuditorium findById(int id) {
		Optional<TblAuditorium> auditorium = auditoriumRepo.findById(id);
		if (auditorium.isPresent())
			return auditorium.get();
		return null;
	}

	public BaseResponse findAuditoriumById(int id) {
		try {
			TblAuditorium auditorium = findById(id);
			if (auditorium == null)
				return null;
		} catch (Exception ex) {
			System.out.println("Loi");
		}
		return null;
	}

	public BaseResponse createAuditorium(AuditoriumRequest request) {
		try {
			TblAuditorium auditorium = new TblAuditorium();
			auditorium.setName(request.getName());
			
			auditorium.setTechnology(request.getTechnology());
			auditorium.setSeetNo(request.getSeetNo());
			auditorium.setStatus(request.getStatus());
			auditorium.setIdCinema(request.getIdCinema());
			save(auditorium);
		} catch (Exception ex) {
			System.out.println("Loi"+ex);
		}
		return null;
	}

	public BaseResponse updateAuditorium(AuditoriumRequest request) {
		try {
			TblAuditorium auditorium = findById(request.getIdAuditorium());
			if (auditorium != null) {
				auditorium.setName(request.getName());
				auditorium.setTechnology(request.getTechnology());
				auditorium.setSeetNo(request.getSeetNo());
				auditorium.setStatus(request.getStatus());
				auditorium.setIdCinema(request.getIdCinema());
				save(auditorium);
			}
		} catch (Exception ex) {
			System.out.println("Loi");
		}
		return null;
	}

	public BaseResponse deleteAuditorium(AuditoriumRequest request) {
		try {
			TblAuditorium auditorium = findById(request.getIdAuditorium());
			if (auditorium != null) {
				auditoriumRepo.delete(auditorium);
			}
		}catch(Exception ex) {
			System.out.println("Loi");
		}
		
		return null;
	}
	
}
