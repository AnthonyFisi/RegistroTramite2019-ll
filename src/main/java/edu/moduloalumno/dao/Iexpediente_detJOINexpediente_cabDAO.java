package edu.moduloalumno.dao;

import java.sql.Date;
import java.util.List;

import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;

public interface Iexpediente_detJOINexpediente_cabDAO {
	
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cab();
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cab(Date fecha1, Date fecha2);
	//esta bien
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_caByTramite(String Tramite);
	
	
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByRecurso(String recurso);

	
	//esta bien
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByConcepto(String Concepto);
	
	
	//esta bien
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByNTramite(int nTramite);
	
	
	
	
	//esta bien
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByAnotacion(String Anotacion);
	//esta bien
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByEstado(String Estado);
}
