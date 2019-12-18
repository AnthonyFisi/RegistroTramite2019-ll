package edu.moduloalumno.entity;

import java.sql.Date;

public class PersonaJOINExpediente_cabJOINTipo_tramite {
	
	private int persona_id;
	private int id_expediente;
	private String persona_apaterno;
	private String persona_amaterno;
	private String persona_nombres;
	private int n_expediente;
	private Date f_expediente;
	private String desc_tipotramite;
	private int estado_id;
	
	
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public int getid_expediente() {
		return id_expediente;
	}
	public void setid_expediente(int id_expediente) {
		this.id_expediente = id_expediente;
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
	public int getn_expediente() {
		return n_expediente;
	}
	public void setn_expediente(int n_expediente) {
		this.n_expediente = n_expediente;
	}
	public Date getF_expediente() {
		return f_expediente;
	}
	public void setF_expediente(Date f_expediente) {
		this.f_expediente = f_expediente;
	}
	public String getDesc_tipotramite() {
		return desc_tipotramite;
	}
	public void setDesc_tipotramite(String desc_tipotramite) {
		this.desc_tipotramite = desc_tipotramite;
	}
	public int getestado_id() {
		return estado_id;
	}
	public void setestado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaJOINExpediente_cabJOINTipo_tramite other = (PersonaJOINExpediente_cabJOINTipo_tramite) obj;
		if (desc_tipotramite != other.desc_tipotramite)
			return false;
		if (estado_id != other.estado_id)
			return false;
		if (f_expediente == null) {
			if (other.f_expediente != null)
				return false;
		} else if (!f_expediente.equals(other.f_expediente))
			return false;
		if (id_expediente != other.id_expediente)
			return false;
		if (n_expediente != other.n_expediente)
			return false;
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
