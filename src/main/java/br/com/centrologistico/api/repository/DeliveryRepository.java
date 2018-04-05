package br.com.centrologistico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centrologistico.api.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>{

}
