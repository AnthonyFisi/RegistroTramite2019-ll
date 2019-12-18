package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Tipo_tramite;

public class Tipo_tramiteRowMapper implements RowMapper<Tipo_tramite> {

	@Override
	public Tipo_tramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tipo_tramite tipo_tramite= new Tipo_tramite();
		tipo_tramite.setId_tipotramite(rs.getInt("id_tipotramite"));
		tipo_tramite.setDesc_tipotramite(rs.getString("desc_tipotramite"));
		tipo_tramite.setSigla_tipotramite(rs.getString("sigla_tipotramite"));
		tipo_tramite.setId_concepto(rs.getInt("id_concepto"));
		return tipo_tramite;
	}

}
