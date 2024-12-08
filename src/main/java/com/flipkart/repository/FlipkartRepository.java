package com.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.dto.Flipkart;

public interface FlipkartRepository extends JpaRepository<Flipkart, Integer> {
	boolean existsByProductNameAndBrand(String productName, String brand);

	List<Flipkart> findByProductName(String productName);

	

}
