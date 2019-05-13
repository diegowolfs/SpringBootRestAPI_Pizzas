/**
 * 
 */
package br.com.unimep.sbrapi.pizzas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unimep.sbrapi.pizzas.models.Pizza;
import br.com.unimep.sbrapi.pizzas.repository.PizzaRepository;

/**
 * @author Prof. Diego Wolfshorndl
 * @version 1.0.0
 *
 */
@Service
public class PizzaService {
	@Autowired private PizzaRepository pizzarepository;
	
	public Pizza save(Pizza pizza) {
		Pizza pizzacriada = pizzarepository.save(pizza);
		return pizzacriada;
	}
	
	public Pizza update(Pizza pizza) {
		Pizza pizzaatualizada = pizzarepository.save(pizza);
		return pizzaatualizada;
	}
	
	public void delete(Long id) {
		pizzarepository.deleteById(id);
	}
	
	public Pizza getById(Long id) {
		Optional<Pizza> resultado = pizzarepository.findById(id);
		return resultado.get();
	}
	
	public List<Pizza> listAll() {
		List<Pizza> pizzas = pizzarepository.findAll();
		return pizzas;
	}

}
