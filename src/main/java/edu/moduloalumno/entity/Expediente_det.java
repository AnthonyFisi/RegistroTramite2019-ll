package edu.moduloalumno.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expediente_det {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_expediente_det", updatable = false, nullable = false)
	private int id_expediente_det;
	private int id_expediente;
	private int persona_id;
	private int id_anotacion;
	private int estado_id;
	private Date f_asignacion;
	private String observaciones;
	
	public int getid_expediente_det() {
		return id_expediente_det;
	}
	public void setid_expediente_det(int id_expediente_det) {
		this.id_expediente_det = id_expediente_det;
	}
	public int getid_expediente() {
		return id_expediente;
	}
	public void setid_expediente(int id_expediente) {
		this.id_expediente = id_expediente;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public int getId_anotacion() {
		return id_anotacion;
	}
	public void setId_anotacion(int id_anotacion) {
		this.id_anotacion = id_anotacion;
	}
	public int getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	public Date getF_asignacion() {
		return f_asignacion;
	}
	public void setF_asignacion(Date f_asignacion) {
		this.f_asignacion = f_asignacion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado_id;
		result = prime * result + ((f_asignacion == null) ? 0 : f_asignacion.hashCode());
		result = prime * result + id_anotacion;
		result = prime * result + id_expediente;
		result = prime * result + id_expediente_det;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + persona_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente_det other = (Expediente_det) obj;
		if (estado_id != other.estado_id)
			return false;
		if (f_asignacion == null) {
			if (other.f_asignacion != null)
				return false;
		} else if (!f_asignacion.equals(other.f_asignacion))
			return false;
		if (id_anotacion != other.id_anotacion)
			return false;
		if (id_expediente != other.id_expediente)
			return false;
		if (id_expediente_det != other.id_expediente_det)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (persona_id != other.persona_id)
			return false;
		return true;
	}
	
	

	
}
