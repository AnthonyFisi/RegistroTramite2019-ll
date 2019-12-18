package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IExpediente_detDAO;
import edu.moduloalumno.entity.Expediente_det;
import edu.moduloalumno.rowmapper.Expediente_detRowMapper;

@Transactional
@Repository
public class Expediente_detDAOImpl implements IExpediente_detDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarExpediente(Expediente_det expediente_det) {
	
	String sql="INSERT INTO expediente_det ("+
			"id_expediente ,"+
			"persona_id ,"+
			 "id_anotacion ,"+
			 "estado_id ,"+
			 "f_asignacion ,"+
			 "observaciones) VALUES (?,?,?,?,?,?)";
	
	this.jdbcTemplate.update(sql,
			expediente_det.getid_expediente(),
			expediente_det.getPersona_id(),
			expediente_det.getId_anotacion(),
			expediente_det.getEstado_id(),
			expediente_det.getF_asignacion(),
			expediente_det.getObservaciones()
			);
	}

	
	
	@Override
	public List<Expediente_det> listaExpediente_det() {
		String sql="Select "+
				"id_expediente_det ,"+
				"id_expediente ,"+
				"persona_id ,"+
				 "id_anotacion ,"+
				 "estado_id ,"+
				 "f_asignacion ,"+
				 "observaciones from expediente_det";
		
		RowMapper<Expediente_det> rowMapper=new Expediente_detRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Expediente_det buscarExpediente_det(String idUsuario) {
		
		String sql="Select "+
				"id_expediente_det ,"+
				"id_expediente ,"+
				"persona_id ,"+
				 "id_anotacion ,"+
				 "estado_id ,"+
				 "f_asignacion ,"+
				 "observaciones from expediente_det";
		RowMapper<Expediente_det> rowMapper= new BeanPropertyRowMapper<Expediente_det>(Expediente_det.class);
		Expediente_det  expediente_det=this.jdbcTemplate.queryForObject(sql,rowMapper,idUsuario);
		return expediente_det;
	}



	@Override
	public Expediente_det insertar(Expediente_det expediente_det) {
		String sql="INSERT INTO expediente_det ("+
				"id_expediente ,"+
				"persona_id ,"+
				 "id_anotacion ,"+
				 "estado_id ,"+
				 "f_asignacion ,"+
				 "observaciones) VALUES (?,?,?,?,?,?)";
		
		this.jdbcTemplate.update(sql,
				expediente_det.getid_expediente(),
				expediente_det.getPersona_id(),
				expediente_det.getId_anotacion(),
				expediente_det.getEstado_id(),
				expediente_det.getF_asignacion(),
				expediente_det.getObservaciones()
				);
		
		String sql2="Select "+
				"id_expediente_det ,"+
				"id_expediente ,"+
				"persona_id ,"+
				 "id_anotacion ,"+
				 "estado_id ,"+
				 "f_asignacion ,"+
				 "observaciones from expediente_det where persona_id = ?";
		RowMapper<Expediente_det> rowMapper= new BeanPropertyRowMapper<Expediente_det>(Expediente_det.class);
		Expediente_det  expediente_det2=this.jdbcTemplate.queryForObject(sql2,rowMapper,expediente_det.getPersona_id());
		return expediente_det2;
		
		
	}

}
