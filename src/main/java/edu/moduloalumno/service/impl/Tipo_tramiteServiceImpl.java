package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITipo_tramiteDAO;
import edu.moduloalumno.entity.Tipo_tramite;
import edu.moduloalumno.service.ITipo_tramiteService;

@Service
public class Tipo_tramiteServiceImpl implements ITipo_tramiteService{

	@Autowired
	ITipo_tramiteDAO Itipo_tramiteDAO;
	
	@Override
	public List<Tipo_tramite> listaTramite() {
		
		return Itipo_tramiteDAO.listaTramite();
	}

	@Override
	public Tipo_tramite listaTramiteByIdConcepto(int idTipo_tramite) {
		return Itipo_tramiteDAO.listaTramiteByIdConcepto(idTipo_tramite);
	}

}
