package com.tender.proRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.entity.Product;

public interface ProRepository extends JpaRepository<Product, Long> {

}
