package edu.moduloalumno.rowmapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;


public class expediente_detJOINexpediente_cabRowMapper implements RowMapper<expediente_detJOINexpediente_cab> {

	@Override
	public expediente_detJOINexpediente_cab mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		expediente_detJOINexpediente_cab expediente= new expediente_detJOINexpediente_cab();
		expediente.setPersona_amaterno(rs.getString("persona_amaterno"));
		expediente.setPersona_apaterno(rs.getString("persona_apaterno"));
		expediente.setPersona_nombres(rs.getString("persona_nombres"));
		expediente.setF_asignacion(rs.getDate("f_asignacion"));
		expediente.setF_expediente(rs.getDate("f_expediente"));
		expediente.setdesc_anotacion(rs.getString("desc_anotacion"));
		expediente.setEstado_descripcion(rs.getString("estado_descripcion"));
		expediente.setObservaciones(rs.getString("observaciones"));
		expediente.setN_expediente(rs.getInt("n_expediente"));
		expediente.setDesc_tipotramite(rs.getString("desc_tipotramite"));
		expediente.setconcepto(rs.getString("concepto"));
		expediente.setApellidos(rs.getString("apellidos"));
		return expediente;
	}

}
