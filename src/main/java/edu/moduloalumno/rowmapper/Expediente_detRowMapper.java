package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Expediente_det;

public class Expediente_detRowMapper implements RowMapper<Expediente_det> {

	@Override
	public Expediente_det mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expediente_det expediente_det=new Expediente_det();
		expediente_det.setid_expediente(rs.getInt("id_expediente"));
		expediente_det.setPersona_id(rs.getInt("persona_id"));
		expediente_det.setId_anotacion(rs.getInt("id_anotacion"));
		expediente_det.setEstado_id(rs.getInt("estado_id"));
		expediente_det.setF_asignacion(rs.getDate("f_asignacion"));
		expediente_det.setObservaciones(rs.getString("observaciones"));
		return expediente_det;
	}

}
