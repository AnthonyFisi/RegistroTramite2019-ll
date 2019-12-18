package edu.moduloalumno.entity;

import java.io.Serializable;
import java.sql.Date;

public class Expediente_detJOINTipo_anotacionJOINEstado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date f_asignacion;
	private String nombres;
	private String desc_anotacion;
	private String estado_descripcion;
	private String observaciones;
	
	
	public Date getF_asignacion() {
		return f_asignacion;
	}
	public void setF_asignacion(Date f_asignacion) {
		this.f_asignacion = f_asignacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDesc_anotacion() {
		return desc_anotacion;
	}
	public void setDesc_anotacion(String desc_anotacion) {
		this.desc_anotacion = desc_anotacion;
	}
	public String getEstado_descripcion() {
		return estado_descripcion;
	}
	public void setEstado_descripcion(String estado_descripcion) {
		this.estado_descripcion = estado_descripcion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
