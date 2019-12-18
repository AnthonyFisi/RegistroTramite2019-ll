package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Persona;



public class PersonaRowMapper implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Persona persona= new Persona();
		
		
		persona.setPersona_id(rs.getInt("persona_id"));
		persona.setPersona_dni(rs.getString("persona_dni"));
		persona.setPersona_apaterno(rs.getString("persona_apaterno"));
		persona.setPersona_amaterno(rs.getString("persona_amaterno"));
		persona.setPersona_nombres(rs.getString("persona_nombres"));
		

		return persona;
	}

}
