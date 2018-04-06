package br.com.centrologistico.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deliveryId;
	
	private Long vehicle;
	
	@OneToMany(mappedBy = "delivery")
	private List<Packages> packages;

	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Long getVehicle() {
		return vehicle;
	}

	public void setVehicle(Long vehicle) {
		this.vehicle = vehicle;
	}

	public List<Packages> getPackages() {
		return packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;
	}
	
	
	
}
