/**
 * 
 */
package br.com.unimep.sbrapi.pizzas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unimep.sbrapi.pizzas.models.Pizza;
import br.com.unimep.sbrapi.pizzas.services.PizzaService;

/**
 * @author Prof. Diego Wolfshorndl
 * @version 1.0.0
 *
 */

@RestController
@RequestMapping(value = "pizzas")
public class PizzaResource {

	@Autowired
	private PizzaService pizzaService;

	@PostMapping
	public ResponseEntity<Pizza> save(@RequestBody Pizza pizza) {
		Pizza pizzacriada = pizzaService.save(pizza);
		return ResponseEntity.status(HttpStatus.CREATED).body(pizzacriada);
	};

	@PutMapping("/{id}")
	public ResponseEntity<Pizza> update(@PathVariable(name = "id") Long id, @RequestBody Pizza pizza) {
		pizza.setId(id);
		Pizza pizzaatualizada = pizzaService.update(pizza);
		return ResponseEntity.ok(pizzaatualizada);
	};

	@GetMapping("/{id}")
	public ResponseEntity<Pizza> getById(@PathVariable(name = "id") Long id) {
		Pizza pizza = pizzaService.getById(id);
		return ResponseEntity.ok(pizza);
	};

	@GetMapping
	public ResponseEntity<List<Pizza>> listAll() {
		List<Pizza> pizzas = pizzaService.listAll();
		return ResponseEntity.ok(pizzas);
	};
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		pizzaService.delete(id);;
	};

}
