package br.com.centrologistico.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<Void> createDelivery(Delivery delivery) {
		deliveryService.save(delivery);
		return ResponseEntity.noContent().build();
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
