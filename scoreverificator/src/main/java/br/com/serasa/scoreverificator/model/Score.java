package br.com.serasa.scoreverificator.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Score {
	
	@Column(name = "description", nullable= false)
	private String description;

	@Column(name = "initial", nullable= false)
	private int initial;
	
	@Column(name = "limit", nullable= false)
	private int limit;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
