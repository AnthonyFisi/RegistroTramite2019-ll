package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Expediente_cab;
import edu.moduloalumno.service.IExpediente_cabService;

@RestController
@RequestMapping("/Expediente_cab")
public class Expediente_cabController {
	
	@Autowired
	IExpediente_cabService service;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Expediente_cab>> listaExpediente_det() {
		List<Expediente_cab> listaExpediente_det=service.listaExpediente_cab();
		return new ResponseEntity<List<Expediente_cab>>(listaExpediente_det, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/guardarExpediente_cab", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void agregarExpediente_det(@RequestBody Expediente_cab expediente_cab) {
		service.insertarExpediente(expediente_cab);
	}
	
	
	
	@RequestMapping(value = "/registrarExpediente_cab", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expediente_cab> guardar(@RequestBody Expediente_cab expediente_cab) {
		
		Expediente_cab expediente=service.agregar(expediente_cab);
		
		return new ResponseEntity<Expediente_cab>(expediente, HttpStatus.OK);
	}
	
}
