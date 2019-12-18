package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITipo_anotacionDAO;
import edu.moduloalumno.entity.Tipo_anotacion;
import edu.moduloalumno.rowmapper.Tipo_anotacionRowMapper;

@Transactional
@Repository
public class Tipo_anotacionDAOImpl implements ITipo_anotacionDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Tipo_anotacion> listaAnotacion() {
		String sql="Select id_anotacion , desc_anotacion from tipo_anotacion";
		RowMapper<Tipo_anotacion> rowMapper=new Tipo_anotacionRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}


}
