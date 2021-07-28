package br.com.alurachallenge.alurachallenge.facades;

import br.com.alurachallenge.alurachallenge.dtos.requests.VideoRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.VideoResponseDTO;

import java.util.List;

public interface VideoFacade {

    List<VideoResponseDTO> findAll();
    VideoResponseDTO findById(Long id);
    VideoResponseDTO save(VideoRequestDTO videoRequestDTO);
    VideoResponseDTO update(Long id, VideoRequestDTO videoRequestDTO);
    void delete(Long id);
}
