package com.kleinbruno.hackathon.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kleinbruno.hackathon.entities.Relato;

public interface RelatoRepository extends JpaRepository<Relato, UUID>{

}
