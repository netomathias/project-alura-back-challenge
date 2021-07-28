package br.com.alurachallenge.alurachallenge.controllers;

import br.com.alurachallenge.alurachallenge.dtos.requests.CategoryRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.CategoryResponseDTO;
import br.com.alurachallenge.alurachallenge.facades.CategoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryFacade categoryFacade;

    @GetMapping
    public List<CategoryResponseDTO> findAll() {
        return categoryFacade.findAll();
    }

    @GetMapping("/{id}")
    public CategoryResponseDTO findById(@PathVariable Long id) {
        return categoryFacade.findById(id);
    }

    @PostMapping
    public CategoryResponseDTO save(@RequestBody @Valid CategoryRequestDTO categoryRequestDTO) {
        return categoryFacade.save(categoryRequestDTO);
    }

    @PutMapping("/{id}")
    public CategoryResponseDTO update(@PathVariable Long id, @RequestBody CategoryRequestDTO categoryRequestDTO) {
        return categoryFacade.update(id, categoryRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        categoryFacade.deleteById(id);
    }
}
