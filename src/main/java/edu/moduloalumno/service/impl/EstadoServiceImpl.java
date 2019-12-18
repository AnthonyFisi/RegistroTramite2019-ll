package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IEstadoDAO;
import edu.moduloalumno.entity.Estado;
import edu.moduloalumno.service.IEstadoService;

@Service
public class EstadoServiceImpl  implements IEstadoService{
	
	@Autowired
	IEstadoDAO estadoDAO;
	
	@Override
	public List<Estado> listaEstado() {
		return  estadoDAO.listaEstado();
	}

}
