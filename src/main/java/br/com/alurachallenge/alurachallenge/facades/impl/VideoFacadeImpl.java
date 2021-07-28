package br.com.alurachallenge.alurachallenge.facades.impl;

import br.com.alurachallenge.alurachallenge.dtos.requests.VideoRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.VideoResponseDTO;
import br.com.alurachallenge.alurachallenge.facades.VideoFacade;
import br.com.alurachallenge.alurachallenge.services.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class VideoFacadeImpl implements VideoFacade {

    @Autowired
    private VideoService videoService;

    @Override
    public List<VideoResponseDTO> findAll() {
        return videoService.findAll();
    }

    @Override
    public VideoResponseDTO findById(Long id) {
        return videoService.findById(id);
    }

    @Override
    public VideoResponseDTO save(VideoRequestDTO videoRequestDTO) {
        return videoService.save(videoRequestDTO);
    }

    @Override
    public VideoResponseDTO update(Long id, VideoRequestDTO videoRequestDTO) {
        return videoService.update(id, videoRequestDTO);
    }

    @Override
    public void delete(Long id) {
        videoService.deleteById(id);
    }
}
