package com.unidadcoronaria.enlace.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_ENLACEACUERDO", sequenceName = "IDENLACEACUERDO")
@Table(name="ENLACESACUERDOS")
public class EnlaceAcuerdo {
	
	@Id
	@Column(name = "IDENLACEACUERDO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_ENLACEACUERDO")
	private Integer idEnlaceAcuerdo;
	
	@Column(name = "IDACUERDO")
	private Integer idAcuerdo;
	
	@Column(name = "IDCABINA")
	private Integer idCabina;
	
	@Column(name = "IDACUERDOSECCION")
	private Integer idAcuerdoSeccion;
	
	@Column(name = "IDACUERDOPLAN")
	private Integer idAcuerdoPlan;
	
	@Column(name = "TOKEN")
	private String token;

	public Integer getIdEnlaceAcuerdo() {
		return idEnlaceAcuerdo;
	}

	public void setIdEnlaceAcuerdo(Integer idEnlaceAcuerdo) {
		this.idEnlaceAcuerdo = idEnlaceAcuerdo;
	}

	public Integer getIdAcuerdo() {
		return idAcuerdo;
	}

	public void setIdAcuerdo(Integer idAcuerdo) {
		this.idAcuerdo = idAcuerdo;
	}

	public Integer getIdCabina() {
		return idCabina;
	}

	public void setIdCabina(Integer idCabina) {
		this.idCabina = idCabina;
	}

	public Integer getIdAcuerdoSeccion() {
		return idAcuerdoSeccion;
	}

	public void setIdAcuerdoSeccion(Integer idAcuerdoSeccion) {
		this.idAcuerdoSeccion = idAcuerdoSeccion;
	}

	public Integer getIdAcuerdoPlan() {
		return idAcuerdoPlan;
	}

	public void setIdAcuerdoPlan(Integer idAcuerdoPlan) {
		this.idAcuerdoPlan = idAcuerdoPlan;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
