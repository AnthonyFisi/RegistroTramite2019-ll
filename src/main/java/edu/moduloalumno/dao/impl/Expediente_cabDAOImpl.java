package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IExpediente_cabDAO;
import edu.moduloalumno.entity.Expediente_cab;
import edu.moduloalumno.entity.Expediente_det;
import edu.moduloalumno.rowmapper.Expediente_cabRowMapper;

@Transactional
@Repository
public class Expediente_cabDAOImpl implements IExpediente_cabDAO{
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertarExpediente(Expediente_cab expediente_cab) {
		String sql="Insert into expediente_cab"+
				" ( n_expediente ,"+
				"f_expediente ,"+
				"persona_id ,"+
				"id_tipotramite ,"+
				"estado_id) values (?,?,?,?,?)";
	this.jdbcTemplate.update(sql,
			expediente_cab.getN_expedediente(),
			expediente_cab.getF_expediente(),
			expediente_cab.getPersona_id(),
			expediente_cab.getId_tipotramite(),
			expediente_cab.getEstado_id()
			);
		
	}

	@Override
	public List<Expediente_cab> listaExpediente_cab() {
		String sql="Select "+
				" id_expediente ,"+
				"n_expediente ,"+
				"f_expediente ,"+
				"persona_id ,"+
				"id_tipotramite ,"+
				"estado_id from expediente_cab";
		RowMapper<Expediente_cab> rowMapper=new Expediente_cabRowMapper();
		
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Expediente_cab agregar(Expediente_cab expediente_cab) {
		
		String sql="Insert into expediente_cab"+
				" ( n_expediente ,"+
				"f_expediente ,"+
				"persona_id ,"+
				"id_tipotramite ,"+
				"estado_id) values (?,?,?,?,?)";
	this.jdbcTemplate.update(sql,
			expediente_cab.getN_expedediente(),
			expediente_cab.getF_expediente(),
			expediente_cab.getPersona_id(),
			expediente_cab.getId_tipotramite(),
			expediente_cab.getEstado_id()
			);
	
	
	String sql2="Select "+
			" id_expediente ,"+
			"n_expediente ,"+
			"f_expediente ,"+
			"persona_id ,"+
			"id_tipotramite ,"+
			"estado_id from expediente_cab  where n_expediente = ? ";
	RowMapper<Expediente_cab> rowMapper= new BeanPropertyRowMapper<Expediente_cab>(Expediente_cab.class);
	Expediente_cab  expediente_det2=this.jdbcTemplate.queryForObject(sql2,rowMapper,expediente_cab.getN_expedediente());
	return expediente_det2;

	}
	

}
