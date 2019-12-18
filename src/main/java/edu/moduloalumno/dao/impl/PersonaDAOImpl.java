package edu.moduloalumno.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IPersonaDAO;
import edu.moduloalumno.entity.Persona;


@Transactional
@Repository
public class PersonaDAOImpl implements IPersonaDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public Persona listaPersona(String apaterno) {
		String sql= "SELECT p.persona_id,p.persona_dni,p.persona_apaterno,p.persona_amaterno,p.persona_nombres  " + 
				"		FROM persona AS p  " + 
				"		where plainto_tsquery( ? ) @@ to_tsvector(coalesce(p.persona_apaterno,'')   " + 
				"		|| ' ' ||coalesce(p.persona_amaterno,'') || ' ' ||coalesce(p.persona_nombres,''))   " ;
		
		RowMapper<Persona> rowMapper = new BeanPropertyRowMapper<Persona>(Persona.class);
		Persona per = jdbcTemplate.queryForObject(sql, rowMapper, apaterno);
		return per;
	}

}
