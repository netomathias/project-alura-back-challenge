package br.com.alurachallenge.alurachallenge.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponseDTO {

    private Long id;
    private String tittle;
    private String color;
}
