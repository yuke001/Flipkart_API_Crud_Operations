package com.flipkart.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flipkart.dto.Flipkart;
import com.flipkart.repository.FlipkartRepository;

@Service
public class FlipkartService {

    @Autowired
    FlipkartRepository repository;

    public ResponseEntity<Object> save(List<Flipkart> viewcarts) {
        repository.saveAll(viewcarts);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "Multiple Records Saved Success");
        map.put("data", viewcarts);
        return new ResponseEntity<Object>(map, HttpStatus.CREATED);
    }

    public ResponseEntity<Object> saveSingle(Flipkart flipkart) {
        repository.save(flipkart);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "Record Saved Success");
        map.put("data", flipkart);
        return new ResponseEntity<Object>(map, HttpStatus.CREATED);
    }

    public ResponseEntity<Object> fetchAll() {
        List<Flipkart> flipkartList = repository.findAll();
        if (flipkartList.isEmpty()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "No Data Found");
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        } else {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "Records Found Success");
            map.put("data", flipkartList);
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        }
    }

    public ResponseEntity<Object> fetchById(int id) {
        Optional<Flipkart> optional = repository.findById(id);
        if (optional.isEmpty()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "No Record Found with ID: " + id);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        } else {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "Record Found Success");
            map.put("data", optional.get());
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        }
    }

    public ResponseEntity<Object> fetchByProductName(String productName) {
        List<Flipkart> flipkartList = repository.findByProductName(productName);
        if (flipkartList.isEmpty()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "No Data Found with Product Name: " + productName);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        } else {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "Records Found Success");
            map.put("data", flipkartList);
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        }
    }

    public ResponseEntity<Object> delete(int id) {
        if (repository.findById(id).isEmpty()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "No Data Found with ID: " + id);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        } else {
            repository.deleteById(id);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "Record Deleted Success");
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        }
    }

    public ResponseEntity<Object> update(Flipkart flipkart) {
        repository.save(flipkart);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "Record Updated Success");
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    public ResponseEntity<Object> updatePartial(int id, Flipkart flipkart) {
        Optional<Flipkart> optional = repository.findById(id);
        if (optional.isEmpty()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error", "No Data Found with ID: " + id);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        } else {
            Flipkart existingFlipkart = optional.get();
            if (flipkart.getProductName() != null)
                existingFlipkart.setProductName(flipkart.getProductName());
            if (flipkart.getPrice() != 0)
                existingFlipkart.setPrice(flipkart.getPrice());
            if (flipkart.getQuantity() != 0)
                existingFlipkart.setQuantity(flipkart.getQuantity());
            repository.save(existingFlipkart);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "Record Partially Updated Success");
            return new ResponseEntity<Object>(map, HttpStatus.OK);
        }
    }




}
