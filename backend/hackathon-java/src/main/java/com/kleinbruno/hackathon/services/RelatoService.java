package com.kleinbruno.hackathon.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleinbruno.hackathon.entities.Relato;
import com.kleinbruno.hackathon.repositories.RelatoRepository;
import com.kleinbruno.hackathon.services.exceptions.ResourceNotFoundException;

@Service
public class RelatoService {

	@Autowired
	private RelatoRepository repository;
	
	public List<Relato> findAll() {
		return repository.findAll();
	}
	
	public Relato findById(UUID id) {
		 Optional<Relato>  obj = repository.findById(id);
		 return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Relato insert(Relato obj) {
		return repository.save(obj);
	}
}
