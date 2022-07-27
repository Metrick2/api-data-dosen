package com.uas.pm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uas.pm.model.Dosen;
import com.uas.pm.service.DosenService; 

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AppController {
	
	@Autowired
	private DosenService dosenService;
	
	@GetMapping("/getData")
	public Iterable<Dosen> getListDataDosen() {
		Iterable<Dosen> list = new ArrayList<>();
		
		list = dosenService.getListDosen();
		
		return list;
	}
	
	@PostMapping("/add")
	public String addDataDosen(@RequestBody Dosen dosen) {
		
		return dosenService.addDataDosen(dosen);
	}
	
	@PutMapping("/update")
	public String updateDataDosen(@RequestBody Dosen dosen) {
		
		return dosenService.updatDataDosen(dosen);
	}
	
	@DeleteMapping("/delete")
	public String removeDataDosen(@RequestBody Dosen dosen) {
		
		return dosenService.removeDataDosen(dosen);
	}
	
}
