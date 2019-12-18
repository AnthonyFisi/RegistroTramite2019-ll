package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAdministrativoDAO;
import edu.moduloalumno.entity.Administrativo;
import edu.moduloalumno.rowmapper.AdministrativoRowMapper;


@Transactional
@Repository  
public class AdministrativoDAOImpl implements IAdministrativoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Administrativo> listaAdministrativos() {
		
		String sql = "SELECT id_admin,nombres FROM administrativo";
		RowMapper<Administrativo> rowMapper = new AdministrativoRowMapper();
		return this.jdbcTemplate.query(sql,rowMapper);
	}

}
