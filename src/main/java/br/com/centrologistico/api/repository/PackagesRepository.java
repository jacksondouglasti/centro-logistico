package br.com.centrologistico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centrologistico.api.entity.Packages;

public interface PackagesRepository extends JpaRepository<Packages, Long>{

}
