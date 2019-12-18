package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacion;

public interface IExpediente_detJOINTipo_anotacionDAO {

	List<Expediente_detJOINTipo_anotacion> listaExpediente_detJOINTipo_anotacion(int id_expediente);
}
