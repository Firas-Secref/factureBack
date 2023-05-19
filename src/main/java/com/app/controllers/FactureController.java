package com.app.controllers;

import com.app.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.app.security.services.FactureService;
import payload.dto.FactureDto;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test/facture")
public class FactureController {
	 @Autowired
	    private FactureService factureService;
	
	  @Autowired
	    public FactureController(FactureService factureService) {
	        this.factureService = factureService;
	    }
	
	 @PreAuthorize("hasRole('ADMIN')")
	    @PutMapping("/{factureId}/mark-as-paid")
	    public ResponseEntity<?> markFactureAsPaid(@PathVariable Long factureId) {
	        factureService.markFactureAsPaid(factureId);
	        return ResponseEntity.ok().build();
	    }

		@GetMapping("/all")
		public List<FactureDto> getAll(){
		  return this.factureService.getAll();
		}
}
//******
