package edu.moduloalumno.entity;

import java.io.Serializable;

public class Tipo_tramite implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id_tipotramite;
	private String desc_tipotramite;
	private String sigla_tipotramite;
	private int id_concepto;
	
	
	
	public int getId_concepto() {
		return id_concepto;
	}
	public void setId_concepto(int id_concepto) {
		this.id_concepto = id_concepto;
	}
	public int getId_tipotramite() {
		return id_tipotramite;
	}
	public void setId_tipotramite(int id_tipotramite) {
		this.id_tipotramite = id_tipotramite;
	}
	public String getDesc_tipotramite() {
		return desc_tipotramite;
	}
	public void setDesc_tipotramite(String desc_tipotramite) {
		this.desc_tipotramite = desc_tipotramite;
	}
	public String getSigla_tipotramite() {
		return sigla_tipotramite;
	}
	public void setSigla_tipotramite(String sigla_tipotramite) {
		this.sigla_tipotramite = sigla_tipotramite;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc_tipotramite == null) ? 0 : desc_tipotramite.hashCode());
		result = prime * result + id_tipotramite;
		result = prime * result + ((sigla_tipotramite == null) ? 0 : sigla_tipotramite.hashCode());
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
		Tipo_tramite other = (Tipo_tramite) obj;
		if (desc_tipotramite == null) {
			if (other.desc_tipotramite != null)
				return false;
		} else if (!desc_tipotramite.equals(other.desc_tipotramite))
			return false;
		if (id_tipotramite != other.id_tipotramite)
			return false;
		if (sigla_tipotramite == null) {
			if (other.sigla_tipotramite != null)
				return false;
		} else if (!sigla_tipotramite.equals(other.sigla_tipotramite))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "tipo_tramite [id_tipotramite=" + id_tipotramite + ", desc_tipotramite=" + desc_tipotramite
				+ ", sigla_tipotramite=" + sigla_tipotramite + "]";
	}
	
	
}
