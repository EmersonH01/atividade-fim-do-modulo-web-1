package br.com.mercado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="estoque")
public class Estoque {
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int  id;
	
	private String nome;
	
	
	public Estoque () {
		
	}
	
	
	
	public Estoque( String nome) {
		this.nome = nome;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
