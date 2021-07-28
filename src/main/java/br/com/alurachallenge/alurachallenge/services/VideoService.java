package br.com.alurachallenge.alurachallenge.services;

import br.com.alurachallenge.alurachallenge.dtos.requests.VideoRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.VideoResponseDTO;

import java.util.List;

public interface VideoService {

    List<VideoResponseDTO> findAll();
    VideoResponseDTO findById(Long id);
    VideoResponseDTO save(VideoRequestDTO videoRequestDTO);
    VideoResponseDTO update(Long id, VideoRequestDTO videoRequestDTO);
    void deleteById(Long id);
}
