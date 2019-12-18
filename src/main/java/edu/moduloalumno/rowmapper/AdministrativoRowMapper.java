package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Administrativo;

public class AdministrativoRowMapper implements RowMapper<Administrativo> {

	@Override
	public Administrativo mapRow(ResultSet row, int rowNum) throws SQLException {
		Administrativo administrativo=new Administrativo();
		administrativo.setIdAdmin(row.getInt("id_admin"));
		administrativo.setNombres(row.getString("nombres"));
		return administrativo;
	}

}
