package com.app.controllers;

import com.app.models.Convention;
import com.app.repository.ConventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.security.services.ConventionService;

import payload.dto.ConventionDto;
import payload.request.ConventionRequest;
import payload.response.ConventionResponse;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test/conventions")
public class ConventionController {

	  @Autowired
	    private ConventionService conventionService;


	    public ConventionController(ConventionService conventionService) {
	        this.conventionService = conventionService;
	    }
	    
	  @PostMapping("/create")
	    public ResponseEntity<ConventionResponse> createConvention(@RequestBody ConventionRequest request) {
	        ConventionResponse response = conventionService.createConvention(request);
	        return ResponseEntity.ok(response);
	    }

		@GetMapping("/getAll")
		public List<ConventionDto> getAll(){
		  return this.conventionService.getAll();
		}
	  
	  
}
