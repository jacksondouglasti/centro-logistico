package br.com.centrologistico.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centrologistico.api.entity.Packages;
import br.com.centrologistico.api.repository.PackagesRepository;

/**
 * Serviço responsavel pelo negócio sobre o package
 * 
 * @author Adão - 05/04/2018
 *
 */
@Service
public class PackagesService {
	
	@Autowired
	public PackagesRepository packagesRepository;
	
	/**
	 * Salva os packages 
	 * 
	 * @param packages
	 * @return packages salvos
	 */
	public Packages save(Packages packages) {
		return packagesRepository.save(packages);
	}

}
