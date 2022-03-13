package br.com.serasa.scoreverificator.service;

import java.util.List;

import br.com.serasa.scoreverificator.model.Affinity;
import br.com.serasa.scoreverificator.model.Person;
import br.com.serasa.scoreverificator.model.Score;

public interface ScoreVerificatorService {

	List<Person> retrieveAllPerson();
	Person retrievePersonById(Long id);
	Person insertPerson(Person person);
	Affinity insertAffinity(Affinity affinity);
	Score insertScore(Score score);
	
}
