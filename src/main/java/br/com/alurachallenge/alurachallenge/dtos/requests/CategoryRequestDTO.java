package br.com.alurachallenge.alurachallenge.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestDTO {

    private Long id;

    @NotNull
    private String tittle;

    @NotNull
    private String color;
}
