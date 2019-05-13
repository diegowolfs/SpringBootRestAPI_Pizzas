/**
 * 
 */
package br.com.unimep.sbrapi.pizzas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Prof. Diego Wolfshorndl
 * @version 1.0.0
 *
 */
@Entity(name = "pizza")
public class Pizza implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 75, nullable = false)
	private String nome;

	@Column(length = 250, nullable = false)
	private String ingredientes;

	@Column(length = 75, nullable = false)
	private String borda;
	
	

	public Pizza() {
		super();
	}

	public Pizza(Long id, String nome, String ingredientes, String borda) {
		super();
		this.id = id;
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.borda = borda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

}
