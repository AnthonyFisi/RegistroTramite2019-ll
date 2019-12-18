package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IExpediente_detJOINTipo_anotacionDAO;
import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacion;
import edu.moduloalumno.service.IExpediente_detJOINTipo_anotacionService;

@Service
public class Expediente_detJOINTipo_anotacionServiceImpl implements IExpediente_detJOINTipo_anotacionService{

	@Autowired 
	IExpediente_detJOINTipo_anotacionDAO expedienteServicio; 
	
	@Override
	public List<Expediente_detJOINTipo_anotacion> listaExpediente_detJOINTipo_anotacion(int id_expediente) {
		
		return expedienteServicio.listaExpediente_detJOINTipo_anotacion(id_expediente);
	}

}
