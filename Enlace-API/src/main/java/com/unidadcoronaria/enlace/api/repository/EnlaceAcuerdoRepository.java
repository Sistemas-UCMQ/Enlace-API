package com.unidadcoronaria.enlace.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unidadcoronaria.enlace.api.domain.EnlaceAcuerdo;


@Repository
public interface EnlaceAcuerdoRepository extends CrudRepository<EnlaceAcuerdo, Long> {
	
	public EnlaceAcuerdo findByToken(String token);
	
	public EnlaceAcuerdo findByIdEnlaceAcuerdo(Integer idEnlaceAcuerdo);

}

