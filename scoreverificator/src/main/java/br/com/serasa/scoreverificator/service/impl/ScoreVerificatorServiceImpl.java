package br.com.serasa.scoreverificator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	private List<Score> retrieveListScore(){
		List<Score> scoreList = new ArrayList<>();
	
		return scoreList;
	}
	
	private String checkScoreStatus(long score) {
		if (score > 1000 || score < 0) 
			return "Valor de Score incompativel, favor consultar o cadastro!";
			
		return "";
	}

	@Override
	public List<Person> retrieveAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person retrievePersonById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person insertPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Affinity insertAffinity(Affinity affinity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Score insertScore(Score score) {
		// TODO Auto-generated method stub
		return null;
	}
}
