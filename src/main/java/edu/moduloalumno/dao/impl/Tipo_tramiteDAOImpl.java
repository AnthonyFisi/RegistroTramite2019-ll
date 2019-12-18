package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITipo_tramiteDAO;
import edu.moduloalumno.entity.Tipo_tramite;
import edu.moduloalumno.rowmapper.Tipo_tramiteRowMapper;

@Transactional
@Repository
public class Tipo_tramiteDAOImpl implements ITipo_tramiteDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Tipo_tramite> listaTramite() {
		String sql="Select id_tipotramite,desc_tipotramite,sigla_tipotramite,id_concepto from tipo_tramite";
		RowMapper<Tipo_tramite> rowMapper= new Tipo_tramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Tipo_tramite listaTramiteByIdConcepto(int idTipo_tramite) {
		String sql="Select id_tipotramite,desc_tipotramite,sigla_tipotramite,id_concepto ,id_concepto from tipo_tramite where id_tipotramite = ?";
		RowMapper<Tipo_tramite> rowMapper= new BeanPropertyRowMapper<Tipo_tramite>(Tipo_tramite.class);
		
		return this.jdbcTemplate.queryForObject(sql, rowMapper,idTipo_tramite);
	}

}
