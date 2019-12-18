package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Tipo_anotacion;
import edu.moduloalumno.service.ITipo_anotacionService;

@RestController
@RequestMapping("/Anotacion")
public class Tipo_anotacionController {
		
	@Autowired
	ITipo_anotacionService service;
	
	@RequestMapping(value="/lista",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity< List<Tipo_anotacion>> listaAnotacion(){
		
		List<Tipo_anotacion> listaTramite= service.listaAnotacion();
		
		return new ResponseEntity<List<Tipo_anotacion>>(listaTramite, HttpStatus.OK);
	}
}
