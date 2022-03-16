package br.com.serasa.scoreverificator.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.serasa.scoreverificator.model.Affinity;
import br.com.serasa.scoreverificator.model.Person;
import br.com.serasa.scoreverificator.model.Score;
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
	
	public ResponseEntity<Object> persistScore(Score score){
		if (scoreIsInvalid(score))
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		try {
			scoreRepository.save(score);			
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
	public ResponseEntity<Object> persistAffinity(Affinity affinity){
		if (affinityIsInvalid(affinity))
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		try {
			affinityRepository.save(affinity);			
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
	public ResponseEntity<Object> getAllPerson(){
		List<Person> personList = new ArrayList<>();
		try {
			personList = personRepository.findAll();			
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		if(personList.isEmpty())
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<Object>(personList, HttpStatus.OK);
	}

	public ResponseEntity<Object> getPersonById(long id){
		Optional<Person> person = Optional.of(new Person());
		try {
			person = personRepository.findById(id);			
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.UNPROCESSABLE_ENTITY);
		}
		if(person == null)
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<Object>(person, HttpStatus.OK);
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
	
	private boolean scoreIsInvalid(Score score) {
		return score == null ||score.getDescription() == null || 
				isInvalidScoreStatus(score.getInitial()) ||
				 isInvalidScoreStatus(score.getLimit());
	}
	
	private boolean affinityIsInvalid(Affinity affinity) {
		return affinity == null || affinity.getRegion() == null
				|| affinity.getStates() == null;
 	}
}
