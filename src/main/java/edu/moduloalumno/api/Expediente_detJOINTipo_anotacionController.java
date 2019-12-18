package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Expediente_detJOINTipo_anotacion;
import edu.moduloalumno.service.IExpediente_detJOINTipo_anotacionService;

@RestController
@RequestMapping("/expediente_det")
public class Expediente_detJOINTipo_anotacionController {

	
	@Autowired
	IExpediente_detJOINTipo_anotacionService service;
	
	@RequestMapping(value = "/lista/{id_expediente}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Expediente_detJOINTipo_anotacion>> listaExpediente_detById(@PathVariable("id_expediente")int id_expediente) {
		List<Expediente_detJOINTipo_anotacion> listaExpediente_det=service.listaExpediente_detJOINTipo_anotacion(id_expediente);
		return new ResponseEntity<List<Expediente_detJOINTipo_anotacion>>(listaExpediente_det, HttpStatus.OK);
	}
}
