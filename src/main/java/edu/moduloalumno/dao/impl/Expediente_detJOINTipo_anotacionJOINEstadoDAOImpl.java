package edu.moduloalumno.dao.impl;

import java.sql.Date;
import java.util.List;

import edu.moduloalumno.dao.IExpediente_detJOINTipo_anotacionJOINEstadoDAO;
import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacionJOINEstado;

public class Expediente_detJOINTipo_anotacionJOINEstadoDAOImpl implements IExpediente_detJOINTipo_anotacionJOINEstadoDAO {

	@Override
	public List<Expediente_detJOINTipo_anotacionJOINEstado> listaBynTramite(int nTramite) {
		String sql ="Select 	 Date f_asignacion," + 
				"	  nombres," + 
				"	  desc_anotacion," + 
				"	  estado_descripcion," + 
				"	  observaciones FROM expediente_det AS e JOIN tipo_anotacion AS t ON e.id_anotacion=t.id_anotacion"
				+ " 	JOIN estado AS es ON es.estado_id=e.estado_id WHERE e.id_expediente_id";
		
		return null;
	}
	


}
