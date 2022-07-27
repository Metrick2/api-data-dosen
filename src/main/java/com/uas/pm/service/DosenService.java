package com.uas.pm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uas.pm.model.Dosen;
import com.uas.pm.repository.DosenRepository;

@Service
public class DosenService {

	@Autowired
	private DosenRepository dosenRepository;
	
	public List<Dosen> getListDosen(){
		List<Dosen> listDosen = new ArrayList<>();
		
		try {
			List<Dosen> dtDosen = (List<Dosen>) dosenRepository.findAll();
			dtDosen.stream().forEach(e -> {
				Dosen dosen = new Dosen();
				BeanUtils.copyProperties(e, dosen);
				listDosen.add(dosen);
			});
			return listDosen;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}
	
	public String addDataDosen(Dosen dosen) {
		try {
			
			Dosen dtDosen = dosenRepository.findByNip(dosen.getNip());
			
			if(dtDosen == null) {
				dosenRepository.save(dosen);
				return "Saved Success";
			}else {
				return "This dosen already exists in the database";
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public String removeDataDosen(Dosen dosen) {
		try {
			Optional<Dosen> mov = dosenRepository.findById(dosen.getIdDosen());
			
			if(mov != null) {
				dosenRepository.delete(dosen);
				return "Deleted Success";
			}else {
				return "This dosen can't delete from database";
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public String updatDataDosen(Dosen dosen) {
		try {
			Optional<Dosen> mov = dosenRepository.findById(dosen.getIdDosen());
			
			if(mov != null) {
				dosenRepository.save(dosen);
				return "Update Success";
			}else {
				return "This dosen can't update from database";
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
}
