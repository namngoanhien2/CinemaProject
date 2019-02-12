package com.dts.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.cinema.entities.TblCinema;
import com.dts.cinema.repository.CinemaCreateRepo;
import com.dts.cinema.request.CinemaRequest;
import com.dts.cinema.response.BaseResponse;

@Service
public class CinemaService {
	@Autowired
	private CinemaCreateRepo cinemaCreateRepo;

	public void save(TblCinema cinema) {
		cinemaCreateRepo.save(cinema);
	}

	public List<TblCinema> findAll() {
		return (List<TblCinema>) cinemaCreateRepo.findAll();
	}

	public TblCinema findById(int id) {
		Optional<TblCinema> cinema = cinemaCreateRepo.findById(id);
		if (cinema.isPresent())
			return cinema.get();
		return null;
	}

	public BaseResponse findCinemaById(int id) {
		try {
			TblCinema cinema = findById(id);
			if (cinema == null)
				return null;
		} catch (Exception ex) {
			System.out.println("Loi");
		}
		return null;
	}

	public BaseResponse createCinema(CinemaRequest request) {
		try {
			TblCinema cinema = new TblCinema();
			// cinema.setIdCinema(request.getIdCinema());
			cinema.setName(request.getName());
			cinema.setAddress(request.getAddress());
			cinema.setKhuVuc(request.getKhuVuc());
			cinema.setQuanlity(request.getQuanlity());
			save(cinema);
		} catch (Exception ex) {
			System.out.println("Loi");
		}
		return null;
	}

	public BaseResponse updateCinema(CinemaRequest request) {
		try {
			TblCinema cinema = findById(request.getIdCinema());
			if (cinema != null) {
				cinema.setName(request.getName());
				cinema.setAddress(request.getAddress());
				cinema.setQuanlity(request.getQuanlity());
				cinema.setKhuVuc(request.getKhuVuc());
				save(cinema);
			}
		} catch (Exception ex) {
			System.out.println("Loi");
		}
		return null;
	}

	public BaseResponse deleteCinema(CinemaRequest request) {
		try {
			TblCinema cinema = findById(request.getIdCinema());
			if (cinema != null) {
				cinemaCreateRepo.delete(cinema);
			}
		}catch(Exception ex) {
			System.out.println("Loi");
		}
		
		return null;
	}
}
