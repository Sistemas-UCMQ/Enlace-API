package com.unidadcoronaria.enlace.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "INC_ACUERDO", sequenceName = "IDACUERDO")
@Table(name="ACUERDOS")
public class Acuerdo {
	
	@Id
	@Column(name = "IDACUERDO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_ACUERDO")
	private Integer idAcuerdo;
	
	@Column(name = "IDEMPRESA")
	private Integer idEmpresa;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "BUSCADOR")
	private String buscador;

	public Integer getIdAcuerdo() {
		return idAcuerdo;
	}

	public void setIdAcuerdo(Integer idAcuerdo) {
		this.idAcuerdo = idAcuerdo;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBuscador() {
		return buscador;
	}

	public void setBuscador(String buscador) {
		this.buscador = buscador;
	}
	
}