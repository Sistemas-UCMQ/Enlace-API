package com.unidadcoronaria.enlace.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.enlace.api.repository.EnlaceAcuerdoRepository;
import com.unidadcoronaria.enlace.api.domain.EnlaceAcuerdo;
import com.unidadcoronaria.enlace.api.exception.UnauthorizedAccessException;

@Service
public class AuthorizationService {
	
	final static Logger logger = Logger.getLogger(AuthorizationService.class);	
	
	@Autowired
	private EnlaceAcuerdoRepository enlaceAcuerdoRepository;
	
	
	public EnlaceAcuerdo validateToken(String token) {
		EnlaceAcuerdo enlaceAcuerdo = validateTokenOnServer(token);
		
		if (enlaceAcuerdo != null) {
			return enlaceAcuerdo;
		} else {
			throw new UnauthorizedAccessException("Authorization Required - Token sent by client is incorrect");
		}
	}
	
	private EnlaceAcuerdo validateTokenOnServer(String token){
		return enlaceAcuerdoRepository.findByToken(token);
	}

}
