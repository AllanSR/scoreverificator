package br.com.serasa.scoreverificator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AFFINITY")
public class Affinity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "REGION", nullable= false)
	private String region;
	
	@Column(name = "STATES", nullable= false)
	private String states;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}
}
