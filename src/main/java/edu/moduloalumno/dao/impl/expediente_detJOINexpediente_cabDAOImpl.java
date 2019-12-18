package edu.moduloalumno.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.Iexpediente_detJOINexpediente_cabDAO;
import edu.moduloalumno.entity.Expediente_det;
import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;
import edu.moduloalumno.rowmapper.Expediente_detRowMapper;
import edu.moduloalumno.rowmapper.expediente_detJOINexpediente_cabRowMapper;


@Transactional
@Repository
public class expediente_detJOINexpediente_cabDAOImpl implements Iexpediente_detJOINexpediente_cabDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cab() {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cab(Date fecha1, Date fecha2) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto " +
				" WHERE ed.f_asignacion  between  ? and ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,fecha1,fecha2);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_caByTramite(String Tramite) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE tt.id_tipotramite = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,Tramite);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByConcepto(String Concepto) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE c.concepto = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,Concepto);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByNTramite(int nTramite) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE ec.n_expediente = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,nTramite);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByRecurso(String recurso) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE a.apellidos = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,recurso);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByAnotacion(String Anotacion) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE ta.desc_anotacion = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,Anotacion);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByEstado(String Estado) {
		String sql ="SELECT	  p.persona_apaterno,  " + 
				"          p.persona_amaterno,  " + 
				"          p.persona_nombres, " + 
				"		  ed.f_asignacion, " + 
				"          ec.f_expediente,  " + 
				"		  ta.desc_anotacion ," + 
				"		 e.estado_descripcion," + 
				"		  ed.observaciones," + 
				"          ec.n_expediente," + 
				"          tt.desc_tipotramite,  " + 
				"          c.concepto," + 
				"          a.apellidos " + 
				" FROM expediente_det AS ed JOIN expediente_cab AS ec ON ed.id_expediente=ec.id_expediente " + 
				"	 					 JOIN persona        AS p  ON p.persona_id=ec.persona_id  " + 
				"						 JOIN tipo_anotacion AS ta ON ta.id_anotacion=ed.id_anotacion  " + 
				"						 JOIN estado         AS e  ON e.estado_id=ed.estado_id   " + 
				"						 JOIN administrativo AS a  ON a.persona_id=ed.persona_id   " + 
				"						 JOIN tipo_tramite   AS tt ON tt.id_tipotramite=ec.id_tipotramite  " + 
				"						JOIN concepto       AS c  ON c.id_concepto=tt.id_concepto "
				+ "   WHERE e.estado_descripcion = ? ";
		
		
		
		RowMapper<expediente_detJOINexpediente_cab> rowMapper=new expediente_detJOINexpediente_cabRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,Estado);
	}

}
