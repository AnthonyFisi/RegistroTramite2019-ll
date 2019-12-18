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
import edu.moduloalumno.entity.PersonaJOINExpediente_cabJOINTipo_tramite;
import edu.moduloalumno.service.IPersonaJOINExpediente_cabJOINTipo_tramiteService;

@RestController
@RequestMapping("/pJOINeJOINt")
public class PersonaJOINExpediente_cabJOINTipo_tramiteController {
	
	@Autowired
	IPersonaJOINExpediente_cabJOINTipo_tramiteService service;
	
	@RequestMapping(value = "/byApellido/{apellido}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PersonaJOINExpediente_cabJOINTipo_tramite>> listaApellido(@PathVariable("apellido") String apellido) {
		List<PersonaJOINExpediente_cabJOINTipo_tramite> listaApellido=service.ListfindByApellido(apellido);
		return new ResponseEntity<List<PersonaJOINExpediente_cabJOINTipo_tramite>>(listaApellido, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/byNTramite/{nTramite}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PersonaJOINExpediente_cabJOINTipo_tramite> agregarExpediente_det(@PathVariable("nTramite") int nTramite) {
		PersonaJOINExpediente_cabJOINTipo_tramite persona=service.ListfindByNumExpediente(nTramite);
		return new ResponseEntity<PersonaJOINExpediente_cabJOINTipo_tramite>(persona, HttpStatus.OK);
	}

}
