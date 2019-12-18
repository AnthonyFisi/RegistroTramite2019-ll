package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IExpediente_detJOINTipo_anotacionDAO;
import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacion;
import edu.moduloalumno.rowmapper.Expediente_detJOINTipo_anotacionRowMapper;


@Transactional
@Repository
public class Expediente_detJOINTipo_anotacionDAOImpl implements IExpediente_detJOINTipo_anotacionDAO{
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Expediente_detJOINTipo_anotacion> listaExpediente_detJOINTipo_anotacion(int id_expediente) {

		String sql="SELECT e.f_asignacion,p.persona_apaterno,ta.desc_anotacion,es.estado_descripcion,e.observaciones " + 
				"FROM expediente_det as e JOIN  tipo_anotacion AS ta ON e.id_anotacion=ta.id_anotacion " + 
				"		JOIN estado AS es ON es.estado_id=e.estado_id " + 
				"		JOIN persona AS p ON p.persona_id=e.persona_id " + 
				"		WHERE e.id_expediente= ?";
		
		
		RowMapper<Expediente_detJOINTipo_anotacion> rowMapper= new Expediente_detJOINTipo_anotacionRowMapper();
		return this.jdbcTemplate.query(sql,rowMapper,id_expediente);
	
	}

}
