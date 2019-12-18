package edu.moduloalumno.entity;

import java.io.Serializable;

public class Tipo_anotacion implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id_anotacion;
	private String desc_anotacion;
	
	public int getId_anotacion() {
		return id_anotacion;
	}
	public void setId_anotacion(int id_anotacion) {
		this.id_anotacion = id_anotacion;
	}
	public String getDesc_anotacion() {
		return desc_anotacion;
	}
	public void setDesc_anotacion(String desc_anotacion) {
		this.desc_anotacion = desc_anotacion;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc_anotacion == null) ? 0 : desc_anotacion.hashCode());
		result = prime * result + id_anotacion;
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
		Tipo_anotacion other = (Tipo_anotacion) obj;
		if (desc_anotacion == null) {
			if (other.desc_anotacion != null)
				return false;
		} else if (!desc_anotacion.equals(other.desc_anotacion))
			return false;
		if (id_anotacion != other.id_anotacion)
			return false;
	
		return true;
	}
	@Override
	public String toString() {
		return "Tipo_anotacion [id_anotacion=" + id_anotacion + ", desc_anotacion=" + desc_anotacion + ", id_concepto="
				+ "]";
	}
	
	
	
	

}
