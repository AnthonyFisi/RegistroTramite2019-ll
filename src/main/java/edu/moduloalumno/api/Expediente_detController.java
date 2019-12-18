package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Expediente_det;
import edu.moduloalumno.service.IExpediente_detService;

@RestController
@RequestMapping("/Expediente_det")
public class Expediente_detController {
	
	@Autowired
	IExpediente_detService service;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Expediente_det>> listaExpediente_det() {
		List<Expediente_det> listaExpediente_det=service.listaExpediente_det();
		return new ResponseEntity<List<Expediente_det>>(listaExpediente_det, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/guardarExpediente_det", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void agregarExpediente_det(@RequestBody Expediente_det expediente_det) {
		
		service.insertarExpediente(expediente_det);

	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expediente_det> agregar(@RequestBody Expediente_det expediente_det) {
		
		Expediente_det expediente=service.insertar(expediente_det);
		
		if(expediente==null) {
			
			expediente = new Expediente_det();
		}
		
		
		return new ResponseEntity<Expediente_det>(expediente, HttpStatus.OK);
	
	}
	
	

}
