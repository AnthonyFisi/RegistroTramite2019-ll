package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IExpediente_cabDAO;
import edu.moduloalumno.entity.Expediente_cab;
import edu.moduloalumno.service.IExpediente_cabService;

@Service
public class Expediente_cabServiceImpl implements IExpediente_cabService{
	
	@Autowired
	IExpediente_cabDAO iExpediente_cabDAO;
	
	@Override
	public void insertarExpediente(Expediente_cab expediente_cab) {
	 this.iExpediente_cabDAO.insertarExpediente(expediente_cab);
	}

	@Override
	public List<Expediente_cab> listaExpediente_cab() {
		return this.iExpediente_cabDAO.listaExpediente_cab();
	}

	@Override
	public Expediente_cab agregar(Expediente_cab expediente_cab) {
		
		return this.iExpediente_cabDAO.agregar(expediente_cab);
	}

}
