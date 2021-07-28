package br.com.alurachallenge.alurachallenge.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoResponseDTO {

    private Long id;
    private String tittle;
    private Long categoryId;
    private String description;
    private String url;


}
