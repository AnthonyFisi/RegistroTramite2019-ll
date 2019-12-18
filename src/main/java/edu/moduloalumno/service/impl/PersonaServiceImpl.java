package edu.moduloalumno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IPersonaDAO;
import edu.moduloalumno.entity.Persona;
import edu.moduloalumno.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	
	@Autowired
	IPersonaDAO personaDao;
	
	@Override
	public Persona listaPersona(String apaterno) {
		return personaDao.listaPersona(apaterno);
	}

}
