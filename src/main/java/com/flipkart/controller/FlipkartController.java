package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.dto.Flipkart;
import com.flipkart.service.FlipkartService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class FlipkartController {

	@Autowired
	FlipkartService service;

	@PostMapping("/viewcarts")
	@Operation(summary = "Adding Multiple Flipkart Records")
	public ResponseEntity<Object> saveFlipkart(@RequestBody List<Flipkart> viewcarts) {
		return service.save(viewcarts);
	}

	@PostMapping("/flipkart")
	@Operation(summary = "Adding One Flipkart Record")
	public ResponseEntity<Object> saveSingleFlipkart(@RequestBody Flipkart flipkart) {
		return service.saveSingle(flipkart);
	}

	@GetMapping("/flipkart")
	@Operation(summary = "Fetch All Flipkart Records")
	public ResponseEntity<Object> fetchAllFlipkart() {
		return service.fetchAll();
	}

	@GetMapping("/flipkart/{id}")
	@Operation(summary = "Fetch Flipkart Record by ID")
	public ResponseEntity<Object> fetchFlipkartById(@PathVariable int id) {
		return service.fetchById(id);
	}

	@GetMapping("/flipkart/product/{productName}")
	@Operation(summary = "Fetch Flipkart Record by Product Name")
	public ResponseEntity<Object> fetchByProductName(@PathVariable String productName) {
		return service.fetchByProductName(productName);
	}

	@DeleteMapping("/flipkart/{id}")
	@Operation(summary = "Delete Flipkart Record by ID")
	public ResponseEntity<Object> deleteFlipkart(@PathVariable int id) {
		return service.delete(id);
	}
	


	@PutMapping("/flipkart")
	@Operation(summary = "Update Flipkart Record - PUT")
	public ResponseEntity<Object> updateFlipkart(@RequestBody Flipkart flipkart) {
		return service.update(flipkart);
	}

	@PatchMapping("/flipkart/{id}")
	@Operation(summary = "Update Flipkart Record - PATCH")
	public ResponseEntity<Object> updatePartialFlipkart(@PathVariable int id, @RequestBody Flipkart flipkart) {
		return service.updatePartial(id, flipkart);
	}
}
