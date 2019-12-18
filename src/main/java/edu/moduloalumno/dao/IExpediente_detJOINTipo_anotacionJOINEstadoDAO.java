package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacionJOINEstado;

public interface IExpediente_detJOINTipo_anotacionJOINEstadoDAO {
	
	List<Expediente_detJOINTipo_anotacionJOINEstado> listaBynTramite(int nTramite);

}
