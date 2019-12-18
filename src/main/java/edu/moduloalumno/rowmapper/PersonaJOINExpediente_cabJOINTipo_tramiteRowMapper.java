package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;

public class PersonaJOINExpediente_cabJOINTipo_tramiteRowMapper implements RowMapper<PersonaJOINExpediente_cabJOINTipo_tramite> {

	@Override
	public PersonaJOINExpediente_cabJOINTipo_tramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersonaJOINExpediente_cabJOINTipo_tramite persona= new PersonaJOINExpediente_cabJOINTipo_tramite();
		persona.setPersona_id(rs.getInt("persona_id"));
		persona.setid_expediente(rs.getInt("id_expediente"));
		persona.setPersona_apaterno("persona_apaterno");
		persona.setPersona_amaterno(rs.getString("persona_amaterno"));
		persona.setPersona_nombres(rs.getString("persona_nombres"));
		persona.setn_expediente(rs.getInt("n_expediente"));
		persona.setF_expediente(rs.getDate("f_expediente"));
		persona.setDesc_tipotramite(rs.getString("desc_tipotramite"));
		persona.setestado_id(rs.getInt("estado_id"));
		return persona;
	
	}

}
