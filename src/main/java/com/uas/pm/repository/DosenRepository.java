package com.uas.pm.repository;

import org.springframework.data.repository.CrudRepository;

import com.uas.pm.model.Dosen;

public interface DosenRepository extends CrudRepository<Dosen, Integer>{
	
	public Dosen findByNip (String nip);

}
