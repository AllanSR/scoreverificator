package br.com.serasa.scoreverificator.model;

import java.util.Date;

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
	
	@Column(name = "DATA_INCLUSAO", nullable= false)
	private Date dataInclusao;
	
	@Column(name = "NOME", nullable= false)
	private String nome;
	
	@Column(name = "TELEFONE", nullable= false)
	private String telefone;
	
	@Column(name = "IDADE", nullable= false)
	private long idade;
	
	@Column(name = "CIDADE", nullable= false)
	private String cidade;
	
	@Column(name = "ESTADO", nullable= false)
	private String estado;
	
	@Column(name = "REGIAO", nullable= false)
	private String regiao;
	
	@Column(name = "SCORE", nullable = false)
	private long score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
}
