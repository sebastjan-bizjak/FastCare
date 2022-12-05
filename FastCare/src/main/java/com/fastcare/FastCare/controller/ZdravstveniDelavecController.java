package com.fastcare.FastCare.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import java.util.logging.Logger;

import com.fastcare.FastCare.repository.ZdravstveniDelavecRepository;
import com.fastcare.FastCare.vao.ZdravstveniDelavec;

@RestController

public class ZdravstveniDelavecController {
	private static final Logger log = Logger.getLogger(ZdravstveniDelavecController.class.toString());
	
	@Autowired
	private ZdravstveniDelavecRepository zdravstveniDelavecRepository;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> getZdravstveneDelavce() {
		return ResponseEntity.ok("Zdravstveni delavci");
	}
	
	@GetMapping("/{id}")
	public ZdravstveniDelavec getZdravstveniDelavec(@PathVariable long id) {
		log.info("Get osebe z id: " + id);
		return zdravstveniDelavecRepository.findById(id).get();
	}
	
	@PostMapping
	public ZdravstveniDelavec postZdravstveniDelavec(@RequestBody ZdravstveniDelavec zdravstveniDelavec) {
		log.info("Dodajanje novega zdravstvenega delavca: " + zdravstveniDelavec);
		return zdravstveniDelavecRepository.save(new ZdravstveniDelavec(zdravstveniDelavec.getIme(), zdravstveniDelavec.getUrgenca(), zdravstveniDelavec.getOddelek()));
	}
}
