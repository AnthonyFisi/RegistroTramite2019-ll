package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IPersonaJOINExpediente_cabJOINTipo_tramiteDAO;
import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;
import edu.moduloalumno.service.IPersonaJOINExpediente_cabJOINTipo_tramiteService;

@Service
public class PersonaJOINExpediente_cabJOINTipo_tramiteServiceImpl implements IPersonaJOINExpediente_cabJOINTipo_tramiteService{
	@Autowired
	IPersonaJOINExpediente_cabJOINTipo_tramiteDAO  persona;
	
	@Override
	public List<PersonaJOINExpediente_cabJOINTipo_tramite> ListfindByApellido(String apellido) {
		return persona.ListfindByApellido(apellido);
	}

	@Override
	public PersonaJOINExpediente_cabJOINTipo_tramite ListfindByNumExpediente(int nExpediente) {
		return persona.ListfindByNumExpediente(nExpediente);
	}

}
