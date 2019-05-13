/**
 * 
 */
package br.com.unimep.sbrapi.pizzas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.com.unimep.sbrapi.pizzas.models.Pizza;

/**
 * @author Prof. Diego Wolfshorndl
 * @version 1.0.0
 *
 */
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

	@Transactional(readOnly = false)
	@Modifying
	@Query("UPDATE pizza SET nome = ?2, ingredientes = ?3, borda = ?4 WHERE id = ?1")
	public int updatePizza(Long id, String nome, String ingredientes, String borda);

	public Optional<Pizza> findById(Long id);

	long count();

	List<Pizza> findAll();

	long deleteById(String id);

}
