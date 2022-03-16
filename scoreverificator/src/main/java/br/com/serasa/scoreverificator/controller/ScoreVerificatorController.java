package br.com.serasa.scoreverificator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.serasa.scoreverificator.model.Affinity;
import br.com.serasa.scoreverificator.model.Person;
import br.com.serasa.scoreverificator.model.Score;
import br.com.serasa.scoreverificator.service.impl.ScoreVerificatorServiceImpl;

@Controller
public class ScoreVerificatorController {
	
	@Autowired
	ScoreVerificatorServiceImpl service;

	@PostMapping(value = "/pessoa")
    public ResponseEntity<Object> createPerson(@RequestBody Person person) {
		return service.persistPerson(person);
    }

	@PostMapping(value = "/affinity")
    public ResponseEntity<Object> createAffinity(Affinity affinity) {
          return service.persistAffinity(affinity);
    }
	
	@PostMapping(value = "/score")
    public ResponseEntity<Object> createScore(Score score) {
          return service.persistScore(score);
    }
	
	@GetMapping(value = "/pessoa/{id}")
    public ResponseEntity<Object> getPersonById(Long id) {
          return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@GetMapping(value = "/pessoa")
    public ResponseEntity<Object> getAllPerson() {
          return service.getAllPerson();
    }
}
