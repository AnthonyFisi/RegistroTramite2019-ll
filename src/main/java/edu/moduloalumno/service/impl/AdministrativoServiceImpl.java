package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAdministrativoDAO;
import edu.moduloalumno.entity.Administrativo;
import edu.moduloalumno.service.IAdministrativoService;

@Service
public class AdministrativoServiceImpl implements IAdministrativoService{
	
	@Autowired 
	IAdministrativoDAO administrativoDAO;
	
	
	@Override
	public List<Administrativo> listarAdministrativos() {
		
		return administrativoDAO.listaAdministrativos();
	}

}
