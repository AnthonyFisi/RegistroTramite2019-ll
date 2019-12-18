package edu.moduloalumno.api;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.expediente_detJOINexpediente_cab;
import edu.moduloalumno.service.Iexpediente_detJOINexpediente_cabService;



@RequestMapping("/expedienteTotal")
@RestController
public class expediente_detJOINexpediente_cabController {

	
	@Autowired
	Iexpediente_detJOINexpediente_cabService service;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteTotal() {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cab();
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/listaByFecha/{fecha1}/{fecha2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteTotalFecha(@PathVariable("fecha1")Date fecha1,@PathVariable("fecha2")Date fecha2) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cab(fecha1, fecha2);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	
	
	

	@RequestMapping(value = "/listaByTramite/{Tramite}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteTramite(@PathVariable("Tramite") String Tramite) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_caByTramite(Tramite);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/listaByConcepto/{Concepto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteConcepto(@PathVariable("Tramite") String Concepto) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cabByConcepto(Concepto);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listaByNTramite/{nTramite}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteNTramite(@PathVariable("nTramite") int nTramite) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cabByNTramite(nTramite);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/listaByRecurso/{Recurso}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteRecurso(@PathVariable("Recurso") String recurso) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cabByRecurso(recurso);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listaByAnotacion/{Anotacion}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteAnotacion(@PathVariable("Anotacion") String Anotacion) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cabByAnotacion(Anotacion);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listaByEstado/{Estado}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<expediente_detJOINexpediente_cab>> getexpedienteEstado(@PathVariable("Estado") String Estado) {
		//logger.info("> getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");

		List<expediente_detJOINexpediente_cab> list = null;

		try {
			list = service.listaexpediente_detJOINexpediente_cabByEstado(Estado);
			
			if (list == null) {
				list = new ArrayList<expediente_detJOINexpediente_cab>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getexpediente_detJOINexpediente_cabIdByNombresApellidos [expediente_detJOINexpediente_cab]");
		return new ResponseEntity<List<expediente_detJOINexpediente_cab>>(list, HttpStatus.OK);
	}
	
	
}
