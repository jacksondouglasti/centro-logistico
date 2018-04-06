package br.com.centrologistico.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centrologistico.api.entity.Delivery;
import br.com.centrologistico.api.repository.DeliveryRepository;

/**
 * Serviço responsavel pelo negócio sobre o delivery
 * 
 * @author Adão - 05/04/2018
 *
 */
@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepository deliveryRepository;
	
	/**
	 * Salva o delivery 
	 * 
	 * @param delivery
	 * @return delivery salvo
	 */
	public Delivery save(Delivery delivery ) {
		return deliveryRepository.save(delivery);
	}

}
