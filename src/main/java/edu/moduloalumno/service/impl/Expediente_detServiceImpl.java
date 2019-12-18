package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IExpediente_detDAO;
import edu.moduloalumno.entity.Expediente_det;
import edu.moduloalumno.service.IExpediente_detService;

@Service
public class Expediente_detServiceImpl implements IExpediente_detService {
	
	@Autowired
	IExpediente_detDAO iExpediente_detDAO;

	@Override
	public void insertarExpediente(Expediente_det expediente_det) {
		this.iExpediente_detDAO.insertarExpediente(expediente_det);
		
	}

	@Override
	public List<Expediente_det> listaExpediente_det() {
		
		return this.iExpediente_detDAO.listaExpediente_det();
	}

	@Override
	public Expediente_det buscarExpediente_det(String idUsuario) {
		return this.buscarExpediente_det(idUsuario);
	}

	@Override
	public Expediente_det insertar(Expediente_det expediente_det) {
		return this.iExpediente_detDAO.insertar(expediente_det);
	}
	
	
	
}
