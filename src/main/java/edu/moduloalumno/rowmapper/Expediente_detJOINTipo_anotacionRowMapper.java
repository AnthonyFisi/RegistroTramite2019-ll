package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacion;

public class Expediente_detJOINTipo_anotacionRowMapper implements RowMapper<Expediente_detJOINTipo_anotacion>{

	@Override
	public Expediente_detJOINTipo_anotacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expediente_detJOINTipo_anotacion expediente= new Expediente_detJOINTipo_anotacion();
		expediente.setF_asignacion(rs.getDate("f_asignacion"));
		expediente.setPersona_apaterno(rs.getString("persona_apaterno"));
		expediente.setDesc_anotacion(rs.getString("desc_anotacion"));
		expediente.setEstado_descripcion(rs.getString("estado_descripcion"));
		expediente.setObservaciones(rs.getString("observaciones"));
		return expediente;
	}

}
