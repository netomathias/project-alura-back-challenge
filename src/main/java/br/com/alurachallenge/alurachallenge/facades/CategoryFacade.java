package br.com.alurachallenge.alurachallenge.facades;

import br.com.alurachallenge.alurachallenge.dtos.requests.CategoryRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.CategoryResponseDTO;

import java.util.List;

public interface CategoryFacade {

    List<CategoryResponseDTO> findAll();
    CategoryResponseDTO findById(Long id);
    CategoryResponseDTO save(CategoryRequestDTO categoryRequestDTO);
    CategoryResponseDTO update(Long id, CategoryRequestDTO categoryRequestDTO);
    void deleteById(Long id);
}
