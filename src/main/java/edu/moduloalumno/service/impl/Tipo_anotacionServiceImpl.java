package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITipo_anotacionDAO;
import edu.moduloalumno.entity.Tipo_anotacion;
import edu.moduloalumno.service.ITipo_anotacionService;

@Service
public class Tipo_anotacionServiceImpl implements ITipo_anotacionService{
	
	@Autowired
	ITipo_anotacionDAO tipo_anotacionDAO;
	
	@Override
	public List<Tipo_anotacion> listaAnotacion() {
		return tipo_anotacionDAO.listaAnotacion();
	}

}
