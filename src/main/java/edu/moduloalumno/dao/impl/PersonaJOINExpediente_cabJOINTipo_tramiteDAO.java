package edu.moduloalumno.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IPersonaJOINExpediente_cabJOINTipo_tramiteDAO;
import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;
import edu.moduloalumno.rowmapper.PersonaJOINExpediente_cabJOINTipo_tramiteRowMapper;

@Transactional
@Repository
public class PersonaJOINExpediente_cabJOINTipo_tramiteDAO implements IPersonaJOINExpediente_cabJOINTipo_tramiteDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PersonaJOINExpediente_cabJOINTipo_tramite> ListfindByApellido(String apellido) {
		String sql="Select    p.persona_id,  " + 
				"          e.id_expediente,  " + 
				"          p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres,  " + 
				"          e.n_expediente,  " + 
				"          e.f_expediente,  " + 
				"          t.desc_tipotramite,  " + 
				"          e.estado_id FROM persona AS p JOIN expediente_cab AS e ON p.persona_id=e.persona_id " + 
				"                                JOIN  tipo_tramite AS t ON t.id_tipotramite=e.id_tipotramite " + 
				"                                WHERE p.persona_apaterno = ?" ;
		
		
		RowMapper<PersonaJOINExpediente_cabJOINTipo_tramite> rowmapper= new PersonaJOINExpediente_cabJOINTipo_tramiteRowMapper();
		
		return this.jdbcTemplate.query(sql,rowmapper,apellido);
	}

	@Override
	public PersonaJOINExpediente_cabJOINTipo_tramite ListfindByNumExpediente(int nExpediente) {
		String sql="Select    p.persona_id,  " + 
				"          e.id_expediente,  " + 
				"          p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres,  " + 
				"          e.n_expediente,  " + 
				"          e.f_expediente,  " + 
				"          t.desc_tipotramite,  " + 
				"          e.estado_id FROM persona AS p JOIN expediente_cab AS e ON p.persona_id=e.persona_id " + 
				"                                JOIN  tipo_tramite AS t ON t.id_tipotramite=e.id_tipotramite " + 
				"                                WHERE  e.n_expediente = ? "; 
		
		RowMapper<PersonaJOINExpediente_cabJOINTipo_tramite> rowMapper = new BeanPropertyRowMapper<PersonaJOINExpediente_cabJOINTipo_tramite>(PersonaJOINExpediente_cabJOINTipo_tramite.class);
		PersonaJOINExpediente_cabJOINTipo_tramite persona=jdbcTemplate.queryForObject(sql,rowMapper,nExpediente);
		return persona;
	}



}
