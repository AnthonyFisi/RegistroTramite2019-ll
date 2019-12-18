package edu.moduloalumno.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Administrativo;
import edu.moduloalumno.service.IAdministrativoService;

@RestController
@RequestMapping("/administrativo")
public class AdministrativoController {
	
	@Autowired
	IAdministrativoService administrativoService;
	
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity< List<Administrativo>> obtenerLista(){
		
		List<Administrativo> alu= administrativoService.listarAdministrativos();
		
		return new ResponseEntity<List<Administrativo>>(alu, HttpStatus.OK);
	}

}
