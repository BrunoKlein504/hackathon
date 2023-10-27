package com.kleinbruno.hackathon.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kleinbruno.hackathon.entities.Relato;
import com.kleinbruno.hackathon.repositories.RelatoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired //resolver injeção de dependência
	private RelatoRepository relatoRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
	
	Relato r1 = new Relato(null, "José", "noggers", "Lorem ipsum dolor sit amet, consectetur "
			+ "adipiscing elit. Vestibulum dapibus justo in ipsum imperdiet molestie.",LocalDateTime.now());
	
	relatoRepository.save(r1);
	
	
	}
}