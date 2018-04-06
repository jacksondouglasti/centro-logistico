package br.com.centrologistico.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centrologistico.api.entity.Delivery;
import br.com.centrologistico.api.service.DeliveryService;

@RestController
@RequestMapping(value = "/delivery")
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryService;

	/**
	 * Salva a entrega no banco de dados passada como parâmetro
	 * 
	 * @param delivery
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
		Delivery deliverySaved = deliveryService.save(delivery);
		ResponseEntity<Delivery> entity = new ResponseEntity<Delivery>(deliverySaved, HttpStatus.CREATED);
		return entity;
	}
	
	/**
	 * Pega a entrega conforme ID passado como parâmetro
	 * 
	 * @param deliveryId
	 * @return
	 */
	@GetMapping(value = "/{deliveryId}/step")
	public ResponseEntity<Long> getDelivery(@PathVariable Long deliveryId) {
		return ResponseEntity.ok(deliveryId);
	}
}
