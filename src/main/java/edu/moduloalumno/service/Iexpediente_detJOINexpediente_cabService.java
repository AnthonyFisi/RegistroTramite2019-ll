package edu.moduloalumno.service;

import java.sql.Date;
import java.util.List;

import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;

public interface Iexpediente_detJOINexpediente_cabService {
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cab();
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cab(Date fecha1,Date fecha2);

	
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_caByTramite(String Tramite);
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByConcepto(String Concepto);
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByNTramite(int nTramite);
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByRecurso(String recurso);
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByAnotacion(String Anotacion);
	List<expediente_detJOINexpediente_cab>  listaexpediente_detJOINexpediente_cabByEstado(String Estado);
}
