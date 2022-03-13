package br.com.serasa.scoreverificator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.serasa.scoreverificator.model.Affinity;
import br.com.serasa.scoreverificator.model.Person;
import br.com.serasa.scoreverificator.model.Score;

@Controller
public class ScoreController {

	@PostMapping(value = "/pessoa")
    public ResponseEntity<Object> createPerson(Person person) {
          return new ResponseEntity<Object>(HttpStatus.CREATED);
    }

	@PostMapping(value = "/affinity")
    public ResponseEntity<Object> createAffinity(Affinity affinity) {
          return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
	@PostMapping(value = "/score")
    public ResponseEntity<Object> createScore(Score score) {
          return new ResponseEntity<Object>(HttpStatus.CREATED);
    }
	
	@GetMapping(value = "/pessoa/{id}")
    public ResponseEntity<Object> getPersonById(Long id) {
          return new ResponseEntity<Object>(HttpStatus.OK);
    }
	
	@GetMapping(value = "/pessoa")
    public ResponseEntity<Object> getAllPerson() {
          return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
