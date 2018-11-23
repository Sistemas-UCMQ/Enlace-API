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
	
	@Autowired
	private PrestacionService prestacionService;
	
	@Autowired
	private CabinaService cabinaService;
	
	final static Logger logger = Logger.getLogger(EnlaceAcuerdoService.class);
	
	public EnlaceAcuerdo getAcuerdo(String token){
		//prestacionService.save();
		cabinaService.getNumeroDePrestacion(enlaceAcuerdoRepository.findByToken(token).getCabina().getIdCabina());
		return enlaceAcuerdoRepository.findByToken(token);
	}

}
