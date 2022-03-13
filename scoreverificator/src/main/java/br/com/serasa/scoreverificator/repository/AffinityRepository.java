package br.com.serasa.scoreverificator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.serasa.scoreverificator.model.Affinity;

@Repository
public interface AffinityRepository extends CrudRepository<Affinity, Long>{

	
}
