package com.unidadcoronaria.enlace.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unidadcoronaria.enlace.api.constant.Constant;
import com.unidadcoronaria.enlace.api.domain.EnlaceAcuerdo;
import com.unidadcoronaria.enlace.api.service.AuthorizationService;
import com.unidadcoronaria.enlace.api.service.EnlaceAcuerdoService;



@Controller
public class EnlaceAcuerdoController {
	
	@Autowired
	private AuthorizationService authorizationService;

	@Autowired
	private EnlaceAcuerdoService enlaceAcuerdoService;

	@RequestMapping(value = "/enlaceAcuerdo", method = RequestMethod.GET)
	@ResponseBody
	public EnlaceAcuerdo getEnlaceAcuerdo(@RequestHeader(value = Constant.AUTHORIZATION_HEADER) final String token) {
		this.authorizationService.validateToken(token);
		return enlaceAcuerdoService.getAcuerdo(token);
	}

}
