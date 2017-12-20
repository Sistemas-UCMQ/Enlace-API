package com.unidadcoronaria.enlace.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidadcoronaria.enlace.api.repository.EnlaceAcuerdoRepository;
import com.unidadcoronaria.enlace.api.exception.UnauthorizedAccessException;

@Service
public class AuthorizationService {
	
	final static Logger logger = Logger.getLogger(AuthorizationService.class);	
	
	@Autowired
	private EnlaceAcuerdoRepository enlaceAcuerdoRepository;
	
	
	public void validateToken(String token) {
		if (!validateTokenOnServer(token)) {
			throw new UnauthorizedAccessException("Authorization Required - Token sent by client is incorrect");
		}
	}
	
	private Boolean validateTokenOnServer(String token){
		Boolean isValid = false;
		if(enlaceAcuerdoRepository.findByToken(token) != null){
			isValid = true;
		} 
		return isValid;
	}

}
