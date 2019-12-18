package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Expediente_cab;

public interface IExpediente_cabService {
	
	void insertarExpediente(Expediente_cab expediente_cab);
	Expediente_cab agregar(Expediente_cab expediente_cab);
	List<Expediente_cab> listaExpediente_cab();
}
