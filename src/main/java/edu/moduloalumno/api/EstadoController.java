package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Estado;
import edu.moduloalumno.service.IEstadoService;

@RestController
@RequestMapping("/Estado")
public class EstadoController {

	@Autowired
	IEstadoService service;
	
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Estado>> listaEstado() {
		List<Estado> listaEstado= service.listaEstado();
		return new ResponseEntity<List<Estado>>(listaEstado, HttpStatus.OK);
	}
}
