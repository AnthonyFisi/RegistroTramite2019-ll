package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Expediente_det;

public interface IExpediente_detService {
	
	void insertarExpediente(Expediente_det expediente_det);
	Expediente_det insertar(Expediente_det expediente_det);
	List<Expediente_det> listaExpediente_det();
	Expediente_det buscarExpediente_det(String idUsuario);
}
