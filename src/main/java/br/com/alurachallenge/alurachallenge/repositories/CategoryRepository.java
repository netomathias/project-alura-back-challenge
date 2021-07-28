package br.com.alurachallenge.alurachallenge.repositories;

import br.com.alurachallenge.alurachallenge.entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
}
