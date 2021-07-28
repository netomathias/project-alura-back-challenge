package br.com.alurachallenge.alurachallenge.facades.impl;

import br.com.alurachallenge.alurachallenge.dtos.requests.CategoryRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.CategoryResponseDTO;
import br.com.alurachallenge.alurachallenge.facades.CategoryFacade;
import br.com.alurachallenge.alurachallenge.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryFacadeImpl implements CategoryFacade {

    @Autowired
    private CategoryService categoryService;

    @Override
    public List<CategoryResponseDTO> findAll() {
        return categoryService.findAll();
    }

    @Override
    public CategoryResponseDTO findById(Long id) {
        return categoryService.findById(id);
    }

    @Override
    public CategoryResponseDTO save(CategoryRequestDTO categoryRequestDTO) {
        return categoryService.save(categoryRequestDTO);
    }

    @Override
    public CategoryResponseDTO update(Long id, CategoryRequestDTO categoryRequestDTO) {
        return categoryService.update(id, categoryRequestDTO);
    }

    @Override
    public void deleteById(Long id) {
        categoryService.deleteById(id);
    }
}
