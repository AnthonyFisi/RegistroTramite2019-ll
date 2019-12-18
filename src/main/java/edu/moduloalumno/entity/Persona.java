package edu.moduloalumno.entity;

import java.io.Serializable;

public class Persona implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int persona_id;
	private String persona_dni;
	private String persona_apaterno;
	private String persona_amaterno;
	private String persona_nombres;
	
	
	
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public String getPersona_dni() {
		return persona_dni;
	}
	public void setPersona_dni(String persona_dni) {
		this.persona_dni = persona_dni;
	}
	public String getPersona_apaterno() {
		return persona_apaterno;
	}
	public void setPersona_apaterno(String persona_apaterno) {
		this.persona_apaterno = persona_apaterno;
	}
	public String getPersona_amaterno() {
		return persona_amaterno;
	}
	public void setPersona_amaterno(String persona_amaterno) {
		this.persona_amaterno = persona_amaterno;
	}
	public String getPersona_nombres() {
		return persona_nombres;
	}
	public void setPersona_nombres(String persona_nombres) {
		this.persona_nombres = persona_nombres;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((persona_amaterno == null) ? 0 : persona_amaterno.hashCode());
		result = prime * result + ((persona_apaterno == null) ? 0 : persona_apaterno.hashCode());
		result = prime * result + ((persona_dni == null) ? 0 : persona_dni.hashCode());
		result = prime * result + persona_id;
		result = prime * result + ((persona_nombres == null) ? 0 : persona_nombres.hashCode());
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
		Persona other = (Persona) obj;
		if (persona_amaterno == null) {
			if (other.persona_amaterno != null)
				return false;
		} else if (!persona_amaterno.equals(other.persona_amaterno))
			return false;
		if (persona_apaterno == null) {
			if (other.persona_apaterno != null)
				return false;
		} else if (!persona_apaterno.equals(other.persona_apaterno))
			return false;
		if (persona_dni == null) {
			if (other.persona_dni != null)
				return false;
		} else if (!persona_dni.equals(other.persona_dni))
			return false;
		if (persona_id != other.persona_id)
			return false;
		if (persona_nombres == null) {
			if (other.persona_nombres != null)
				return false;
		} else if (!persona_nombres.equals(other.persona_nombres))
			return false;
		return true;
	}
	
	

}
