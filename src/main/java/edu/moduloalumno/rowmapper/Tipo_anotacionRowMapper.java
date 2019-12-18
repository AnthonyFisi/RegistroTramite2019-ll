package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Tipo_anotacion;


public class Tipo_anotacionRowMapper implements RowMapper<Tipo_anotacion> {

	@Override
	public Tipo_anotacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tipo_anotacion tipo_anotacion= new Tipo_anotacion();
		tipo_anotacion.setId_anotacion(rs.getInt("id_anotacion"));
		tipo_anotacion.setDesc_anotacion(rs.getString("desc_anotacion"));
		return tipo_anotacion;
	}

}
