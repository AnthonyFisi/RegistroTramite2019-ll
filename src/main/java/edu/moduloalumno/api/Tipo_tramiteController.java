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

import edu.moduloalumno.entity.Tipo_tramite;
import edu.moduloalumno.service.ITipo_tramiteService;

@RestController
@RequestMapping("/Tipo_tramite")
public class Tipo_tramiteController {
	
	@Autowired
	ITipo_tramiteService service;
	
	@RequestMapping(value="/lista",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tipo_tramite>> listaTipo_tramite(){
		List<Tipo_tramite> tipo_tramite = service.listaTramite();
		return  new ResponseEntity<List<Tipo_tramite>>(tipo_tramite,HttpStatus.OK);
		
	}
	

	@RequestMapping(value="/lista/{id_tramite}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tipo_tramite> listaTipo_tramite(@PathVariable("id_tramite") int id_tramite ){
		Tipo_tramite tipo_tramite = service.listaTramiteByIdConcepto(id_tramite);
		return  new ResponseEntity<Tipo_tramite>(tipo_tramite,HttpStatus.OK);
		
	}
}
