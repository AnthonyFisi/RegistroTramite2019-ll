package edu.moduloalumno.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Persona;
import edu.moduloalumno.service.IPersonaService;

@RestController 
@RequestMapping("/Persona")
public class PersonaController {
	
	@Autowired
	IPersonaService service;
	
	
	@RequestMapping(value = "/lista/{apaterno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> getPersonaIdByApeNom(@PathVariable String apaterno) {

		Persona persona = null;

			 persona =  service.listaPersona(apaterno);
	

		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	

}
