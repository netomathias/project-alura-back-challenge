package br.com.alurachallenge.alurachallenge.services.impl;

import br.com.alurachallenge.alurachallenge.dtos.requests.CategoryRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.CategoryResponseDTO;
import br.com.alurachallenge.alurachallenge.entities.CategoryEntity;
import br.com.alurachallenge.alurachallenge.repositories.CategoryRepository;
import br.com.alurachallenge.alurachallenge.services.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CategoryResponseDTO> findAll() {
        List<CategoryResponseDTO> categoryResponseDTOList = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryRepository.findAll()) {
            categoryResponseDTOList.add(convertEntityToDTO(categoryEntity));
        }
        return categoryResponseDTOList;
    }

    @Override
    public CategoryResponseDTO findById(Long id) {
        return convertEntityToDTO(categoryRepository.findById(id).orElse(new CategoryEntity()));
    }

    @Override
    public CategoryResponseDTO save(CategoryRequestDTO categoryRequestDTO) {
        return convertEntityToDTO(categoryRepository.save(convertDTOToEntity(categoryRequestDTO)));
    }

    @Override
    public CategoryResponseDTO update(Long id, CategoryRequestDTO categoryRequestDTO) {
        findById(id);
        categoryRequestDTO.setId(id);
        return convertEntityToDTO(categoryRepository.save(convertDTOToEntity(categoryRequestDTO)));
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    private CategoryResponseDTO convertEntityToDTO(CategoryEntity categoryEntity) {
        return modelMapper.map(categoryEntity, CategoryResponseDTO.class);
    }

    private CategoryEntity convertDTOToEntity(CategoryRequestDTO categoryRequestDTO) {
        return modelMapper.map(categoryRequestDTO, CategoryEntity.class);
    }
}
