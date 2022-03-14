package br.com.serasa.scoreverificator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.serasa.scoreverificator.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository <Score, Long>{

}
