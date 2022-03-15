package br.com.serasa.scoreverificator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "INCLUSION_DATE", nullable= false)
	private String inclusionDate;
	
	@Column(name = "PERSON_NAME", nullable= false)
	private String name;
	
	@Column(name = "PHONE", nullable= false)
	private String phone;
	
	@Column(name = "PERSON_AGE", nullable= false)
	private String age;
	
	@Column(name = "CITY", nullable= false)
	private String city;
	
	@Column(name = "STATE", nullable= false)
	private String state;
	
	@Column(name = "REGION", nullable= false)
	private String region;
	
	@Column(name = "SCORE", nullable = false)
	private long score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInclusionDate() {
		return inclusionDate;
	}

	public void setInclusionDate(String inclusionDate) {
		this.inclusionDate = inclusionDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
}
