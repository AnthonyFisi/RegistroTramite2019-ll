package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;

public interface IPersonaJOINExpediente_cabJOINTipo_tramiteDAO {
	
	List<PersonaJOINExpediente_cabJOINTipo_tramite> ListfindByApellido(String apellido);
	PersonaJOINExpediente_cabJOINTipo_tramite ListfindByNumExpediente(int nExpediente);

}
