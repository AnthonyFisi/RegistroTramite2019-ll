package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Expediente_cab;

public class Expediente_cabRowMapper  implements RowMapper<Expediente_cab> {

	@Override
	public Expediente_cab mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expediente_cab expediente_cab=new Expediente_cab();
		expediente_cab.setN_expedediente(rs.getInt("n_expediente"));
		expediente_cab.setF_expediente(rs.getDate("f_expediente"));
		expediente_cab.setPersona_id(rs.getInt("persona_id"));
		expediente_cab.setId_tipotramite(rs.getInt("id_tipotramite"));
		expediente_cab.setEstado_id(rs.getInt("estado_id"));
		return expediente_cab;
	}

}
