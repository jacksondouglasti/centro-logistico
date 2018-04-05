package br.com.centrologistico.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centrologistico.api.entity.Delivery;
import br.com.centrologistico.api.repository.DeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepository deliveryRepository;
	
	public Delivery save(Delivery delivery ) {
		return deliveryRepository.save(delivery);
	}

}
