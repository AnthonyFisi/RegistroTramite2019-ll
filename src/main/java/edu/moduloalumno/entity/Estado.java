package edu.moduloalumno.entity;

import java.io.Serializable;

public class Estado implements Serializable{


	private static final long serialVersionUID = 1L;
	
	
	private int estado_id;
	private String estado_descripcion;
	private String estado_abrev;
	public int getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	public String getEstado_descripcion() {
		return estado_descripcion;
	}
	public void setEstado_descripcion(String estado_descripcion) {
		this.estado_descripcion = estado_descripcion;
	}
	public String getEstado_abrev() {
		return estado_abrev;
	}
	public void setEstado_abrev(String estado_abrev) {
		this.estado_abrev = estado_abrev;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado_abrev == null) ? 0 : estado_abrev.hashCode());
		result = prime * result + ((estado_descripcion == null) ? 0 : estado_descripcion.hashCode());
		result = prime * result + estado_id;
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
		Estado other = (Estado) obj;
		if (estado_abrev == null) {
			if (other.estado_abrev != null)
				return false;
		} else if (!estado_abrev.equals(other.estado_abrev))
			return false;
		if (estado_descripcion == null) {
			if (other.estado_descripcion != null)
				return false;
		} else if (!estado_descripcion.equals(other.estado_descripcion))
			return false;
		if (estado_id != other.estado_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Estado [estado_id=" + estado_id + ", estado_descripcion=" + estado_descripcion + ", estado_abrev="
				+ estado_abrev + "]";
	}
	
	

}
