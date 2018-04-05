package br.com.centrologistico.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/delivery")
public class DeliveryController {

	@PostMapping
	public ResponseEntity<Void> createDelivery() {
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value = "/{deliveryId}/step")
	public ResponseEntity<Long> getDelivery(@PathVariable Long deliveryId) {
		return ResponseEntity.ok(deliveryId);
	}
}
