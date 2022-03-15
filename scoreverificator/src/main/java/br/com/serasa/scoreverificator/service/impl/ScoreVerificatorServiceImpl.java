package br.com.serasa.scoreverificator.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.serasa.scoreverificator.model.Person;
import br.com.serasa.scoreverificator.repository.AffinityRepository;
import br.com.serasa.scoreverificator.repository.PersonRepository;
import br.com.serasa.scoreverificator.repository.ScoreRepository;
import br.com.serasa.scoreverificator.service.ScoreVerificatorService;

@Service
public class ScoreVerificatorServiceImpl implements ScoreVerificatorService{

	@Autowired
	private AffinityRepository affinityRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	public void retrieveScoreDescription() {
		
	}
	
	public ResponseEntity<Object> persistPerson(Person person) {
		if (personIsInvalid(person))
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		try {
			person.setDataInclusao(new Date());
			personRepository.save(person);			
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
		
	private boolean isInvalidScoreStatus(long score) {
		return score > 1000 || score < 0;
	}
	
	private boolean personIsInvalid(Person person) {
		return person == null ||  
				person.getCidade() == null || person.getNome() == null || 
				 person.getTelefone() == null || person.getIdade() < 0 ||
				  isInvalidScoreStatus(person.getScore());	
				
	}
}
