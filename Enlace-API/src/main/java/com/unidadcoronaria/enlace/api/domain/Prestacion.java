package com.unidadcoronaria.enlace.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "INC_PRESTACION", sequenceName = "IDPRESTACION")
@Table(name="PRESTACIONES")
public class Prestacion {
	
	@Id
	@Column(name = "IDPRESTACION")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRESTACION")
	private Integer idPrestacion;

	@Column(name = "IDCABINA")
	private Integer idCabina;
	
	@ManyToOne
	@JoinColumn(name = "IDDOMICILIOPRESTACION")
	private DomicilioPrestacion domicilioPrestacion;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "FECHA")
	private Date fecha;
	
	@Column(name = "HORATOMADO")
	private Integer horaTomado;
	
	@Column(name = "IDTIPOPRESTACION")
	private Integer idTipoPrestacion;
	
	@Column(name = "COLORTOMADO")
	private String colorTomado;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "EDAD")
	private Integer edad;
	
	@Column(name = "EDADEXPRESADAEN")
	private String edadExpresadaEn;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "IDOPERADORCABINATOMADOR")
	private Integer idOperadorCabinaTomador;
	
	@Column(name = "COBERTURA")
	private String cobertura;
	
	@Column(name = "IDACUERDOSECCION")
	private Integer idAcuerdoSeccion;
	
	@Column(name = "IDACUERDOPLAN")
	private Integer idAcuerdoPlan;
	
	@Column(name = "IDAFILIADO")
	private Integer idAfiliado;
	
	@Column(name = "IDPAQUETE")
	private Integer idPaquete;
	
	@Column(name = "COPAGO")
	private char copago;
	
	@Column(name = "COPAGOIMPORTE")
	private Double copagoImporte;
	
	@Column(name = "COPAGOINFERIDO")
	private char copagoInferido;
	
	@Column(name = "COPAGOMEDIODEPAGO")
	private String copagoMedioDePago;
	
	@Column(name = "COPAGOMOTIVONOCORRESPONDE")
	private String copagoMotivoNoCorresponde;
	
	@Column(name = "INCIDENTEEXTERNO")
	private String incidenteExterno;
	
	@Column(name = "NUMEROAFILIADOEXTERNO")
	private String numeroAfiliadoExterno;
	
	@Column(name = "NOTAS")
	private String notas;
	
	@Column(name = "AUDITORIA_ESTADO")
	private String auditoriaEstado;
	
	@Column(name = "AUDITORIA_FASE")
	private Integer auditoriaFase;
	
	@Column(name = "AUDITORIA_ARRIBO")
	private Integer auditoriaArribo;
	
	@Column(name = "AUDITORIA_CONFORMIDAD")
	private Integer auditoriaConformidad;

	public Integer getIdPrestacion() {
		return idPrestacion;
	}

	public void setIdPrestacion(Integer idPrestacion) {
		this.idPrestacion = idPrestacion;
	}

	public Integer getIdCabina() {
		return idCabina;
	}

	public void setIdCabina(Integer idCabina) {
		this.idCabina = idCabina;
	}

	public DomicilioPrestacion getDomicilioPrestacion() {
		return domicilioPrestacion;
	}

	public void setDomicilioPrestacion(DomicilioPrestacion domicilioPrestacion) {
		this.domicilioPrestacion = domicilioPrestacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getHoraTomado() {
		return horaTomado;
	}

	public void setHoraTomado(Integer horaTomado) {
		this.horaTomado = horaTomado;
	}

	public Integer getIdTipoPrestacion() {
		return idTipoPrestacion;
	}

	public void setIdTipoPrestacion(Integer idTipoPrestacion) {
		this.idTipoPrestacion = idTipoPrestacion;
	}

	public String getColorTomado() {
		return colorTomado;
	}

	public void setColorTomado(String colorTomado) {
		this.colorTomado = colorTomado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEdadExpresadaEn() {
		return edadExpresadaEn;
	}

	public void setEdadExpresadaEn(String edadExpresadaEn) {
		this.edadExpresadaEn = edadExpresadaEn;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdOperadorCabinaTomador() {
		return idOperadorCabinaTomador;
	}

	public void setIdOperadorCabinaTomador(Integer idOperadorCabinaTomador) {
		this.idOperadorCabinaTomador = idOperadorCabinaTomador;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
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

	public Integer getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(Integer idAfiliado) {
		this.idAfiliado = idAfiliado;
	}

	public Integer getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}

	public char getCopago() {
		return copago;
	}

	public void setCopago(char copago) {
		this.copago = copago;
	}

	public Double getCopagoImporte() {
		return copagoImporte;
	}

	public void setCopagoImporte(Double copagoImporte) {
		this.copagoImporte = copagoImporte;
	}

	public char getCopagoInferido() {
		return copagoInferido;
	}

	public void setCopagoInferido(char copagoInferido) {
		this.copagoInferido = copagoInferido;
	}

	public String getCopagoMedioDePago() {
		return copagoMedioDePago;
	}

	public void setCopagoMedioDePago(String copagoMedioDePago) {
		this.copagoMedioDePago = copagoMedioDePago;
	}

	public String getCopagoMotivoNoCorresponde() {
		return copagoMotivoNoCorresponde;
	}

	public void setCopagoMotivoNoCorresponde(String copagoMotivoNoCorresponde) {
		this.copagoMotivoNoCorresponde = copagoMotivoNoCorresponde;
	}

	public String getIncidenteExterno() {
		return incidenteExterno;
	}

	public void setIncidenteExterno(String incidenteExterno) {
		this.incidenteExterno = incidenteExterno;
	}

	public String getNumeroAfiliadoExterno() {
		return numeroAfiliadoExterno;
	}

	public void setNumeroAfiliadoExterno(String numeroAfiliadoExterno) {
		this.numeroAfiliadoExterno = numeroAfiliadoExterno;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getAuditoriaEstado() {
		return auditoriaEstado;
	}

	public void setAuditoriaEstado(String auditoriaEstado) {
		this.auditoriaEstado = auditoriaEstado;
	}

	public Integer getAuditoriaFase() {
		return auditoriaFase;
	}

	public void setAuditoriaFase(Integer auditoriaFase) {
		this.auditoriaFase = auditoriaFase;
	}

	public Integer getAuditoriaArribo() {
		return auditoriaArribo;
	}

	public void setAuditoriaArribo(Integer auditoriaArribo) {
		this.auditoriaArribo = auditoriaArribo;
	}

	public Integer getAuditoriaConformidad() {
		return auditoriaConformidad;
	}

	public void setAuditoriaConformidad(Integer auditoriaConformidad) {
		this.auditoriaConformidad = auditoriaConformidad;
	}
	

}
