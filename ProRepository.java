package com.tender.proRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.entity.Product;

public interface ProRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByName(String fileName);
}
