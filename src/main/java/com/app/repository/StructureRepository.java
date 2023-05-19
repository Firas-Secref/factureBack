package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.models.Structure;
@CrossOrigin(origins = "*", maxAge = 3600)


@Repository
public interface StructureRepository extends JpaRepository<Structure, Long> {
    List<Structure> findByMinistereIsNull();
    List<Structure> findByMinistereIsNotNull();
    void deleteById(Long id);
	Optional<Structure> findByMinistereId(Long id);
	Structure findByCode(String code);
	Structure findByLibelle(String libelle);
	
	//Optional<Application> findByMinistere(String structureMinistere);
} 

