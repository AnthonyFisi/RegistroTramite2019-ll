package edu.moduloalumno.rowmapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacionJOINEstado;

public class Expediente_detJOINTipo_anotacionJOINEstadoRowMapper implements RowMapper<Expediente_detJOINTipo_anotacionJOINEstado>{

	@Override
	public Expediente_detJOINTipo_anotacionJOINEstado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expediente_detJOINTipo_anotacionJOINEstado expediente= new Expediente_detJOINTipo_anotacionJOINEstado();
		expediente.setF_asignacion(rs.getDate("f_asignacion"));
		expediente.setNombres(rs.getString("nombres"));
		expediente.setDesc_anotacion(rs.getString("desc_anotacion"));
		expediente.setEstado_descripcion(rs.getString("estado_descripcion"));
		expediente.setObservaciones(rs.getString("observaciones"));
		return expediente;
	}	
}
