package edu.moduloalumno.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Expediente_cab implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_expediente", updatable = false, nullable = false)
	private int id_expediente;
	private int n_expedediente;
	private Date f_expediente;
	private int persona_id;
	private int id_tipotramite;
	private int estado_id;
	public int getid_expediente() {
		return id_expediente;
	}
	public void setid_expediente(int id_expediente) {
		this.id_expediente = id_expediente;
	}
	public int getN_expedediente() {
		return n_expedediente;
	}
	public void setN_expedediente(int n_expedediente) {
		this.n_expedediente = n_expedediente;
	}
	public Date getF_expediente() {
		return f_expediente;
	}
	public void setF_expediente(Date f_expediente) {
		this.f_expediente = f_expediente;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public int getId_tipotramite() {
		return id_tipotramite;
	}
	public void setId_tipotramite(int id_tipotramite) {
		this.id_tipotramite = id_tipotramite;
	}
	public int getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado_id;
		result = prime * result + ((f_expediente == null) ? 0 : f_expediente.hashCode());
		result = prime * result + id_expediente;
		result = prime * result + id_tipotramite;
		result = prime * result + n_expedediente;
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
		Expediente_cab other = (Expediente_cab) obj;
		if (estado_id != other.estado_id)
			return false;
		if (f_expediente == null) {
			if (other.f_expediente != null)
				return false;
		} else if (!f_expediente.equals(other.f_expediente))
			return false;
		if (id_expediente != other.id_expediente)
			return false;
		if (id_tipotramite != other.id_tipotramite)
			return false;
		if (n_expedediente != other.n_expedediente)
			return false;
		if (persona_id != other.persona_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Expediente_cab [id_expediente=" + id_expediente + ", n_expedediente=" + n_expedediente
				+ ", f_expediente=" + f_expediente + ", persona_id=" + persona_id + ", id_tipotramite=" + id_tipotramite
				+ ", estado_id=" + estado_id + "]";
	}
	
	
	
	
}
