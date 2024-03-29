package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoProgramaJOINProgramaJOINAlumnoDAO;
import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;
import edu.moduloalumno.rowmapper.AlumnoProgramaJOINProgramaJOINAlumnoRowMapper;
import edu.moduloalumno.rowmapper.AlumnoProgramaJOINProgramaRowMapper;

@Transactional
@Repository
public class AlumnoProgramaJOINProgramaJOINAlumnoDAOImpl implements IAlumnoProgramaJOINProgramaJOINAlumnoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAllAlumnoProgramaJOINProgramaJOINAlumnos() {
		String sql = "SELECT aap.id_alum, a.ape_nom as nom_alumno, aap.cod_alumno,  aap.id_programa, p.nom_programa, p.sigla_programa FROM alumno a, alumno_programa ap, alumno_alumno_programa aap, programa p where aap.id_alum = a.id_alum and aap.cod_alumno = ap.cod_alumno and aap.id_programa = p.id_programa order by aap.id_alum";
		// RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> rowMapper = new
		// BeanPropertyRowMapper<AlumnoProgramaJOINProgramaJOINAlumno>(AlumnoProgramaJOINProgramaJOINAlumno.class);
		RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> rowMapper = new AlumnoProgramaJOINProgramaJOINAlumnoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido(String nombresApellidos) {
		String sql = "SELECT ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as nom_alumno, ap.cod_alumno, p.id_programa, p.nom_programa, p.sigla_programa FROM alumno_programa ap, programa p where plainto_tsquery( translate( ? ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') ) @@ to_tsvector(coalesce(translate(ap.nom_alumno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'),'') || ' ' ||coalesce(translate(ap.ape_paterno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'),'') || ' ' ||coalesce(translate(ap.ape_materno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'))) and ap.id_programa = p.id_programa";
		// RowMapper<AlumnoPrograma> rowMapper = new
		// BeanPropertyRowMapper<AlumnoPrograma>(AlumnoPrograma.class);
		RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> rowMapper = new AlumnoProgramaJOINProgramaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombresApellidos);
	}
	
}