package com.unidadcoronaria.enlace.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.enlace.api.domain.EnlaceAcuerdo;
import com.unidadcoronaria.enlace.api.repository.EnlaceAcuerdoRepository;

@Service
public class EnlaceAcuerdoService {
	
	@Autowired
	private EnlaceAcuerdoRepository enlaceAcuerdoRepository;
	
	final static Logger logger = Logger.getLogger(EnlaceAcuerdoService.class);
	
	public EnlaceAcuerdo getAcuerdo(String token){
		return enlaceAcuerdoRepository.findByToken(token);
	}

}
