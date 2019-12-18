package edu.moduloalumno.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.Iexpediente_detJOINexpediente_cabDAO;
import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;
import edu.moduloalumno.service.Iexpediente_detJOINexpediente_cabService;


@Service
public class expediente_detJOINexpediente_cabServiceImpl implements Iexpediente_detJOINexpediente_cabService{
	
	@Autowired
	Iexpediente_detJOINexpediente_cabDAO expediente;
	
	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cab() {
		
		return expediente.listaexpediente_detJOINexpediente_cab();
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cab(Date fecha1, Date fecha2) {
		return expediente.listaexpediente_detJOINexpediente_cab(fecha1, fecha2);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_caByTramite(String Tramite) {
		return expediente.listaexpediente_detJOINexpediente_caByTramite(Tramite);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByConcepto(String Concepto) {
		return expediente.listaexpediente_detJOINexpediente_cabByConcepto(Concepto);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByNTramite(int nTramite) {
		return expediente.listaexpediente_detJOINexpediente_cabByNTramite(nTramite);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByRecurso(String recurso) {
		return expediente.listaexpediente_detJOINexpediente_cabByRecurso(recurso);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByAnotacion(String Anotacion) {
		return expediente.listaexpediente_detJOINexpediente_cabByAnotacion(Anotacion);
	}

	@Override
	public List<expediente_detJOINexpediente_cab> listaexpediente_detJOINexpediente_cabByEstado(String Estado) {
		return expediente.listaexpediente_detJOINexpediente_cabByEstado(Estado);
	}

}
