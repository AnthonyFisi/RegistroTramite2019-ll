package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Tipo_tramite;

public interface ITipo_tramiteService {
		
	
	List<Tipo_tramite> listaTramite();
	Tipo_tramite listaTramiteByIdConcepto(int idTipo_tramite);
}
