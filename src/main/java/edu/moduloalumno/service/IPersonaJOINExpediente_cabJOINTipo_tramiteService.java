package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;

public interface IPersonaJOINExpediente_cabJOINTipo_tramiteService {
	
	List<PersonaJOINExpediente_cabJOINTipo_tramite> ListfindByApellido(String apellido);
	PersonaJOINExpediente_cabJOINTipo_tramite ListfindByNumExpediente(int nExpediente);


}
