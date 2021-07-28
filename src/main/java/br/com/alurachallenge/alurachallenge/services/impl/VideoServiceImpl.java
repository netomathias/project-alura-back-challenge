package br.com.alurachallenge.alurachallenge.services.impl;

import br.com.alurachallenge.alurachallenge.dtos.requests.VideoRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.VideoResponseDTO;
import br.com.alurachallenge.alurachallenge.entities.VideoEntity;
import br.com.alurachallenge.alurachallenge.repositories.VideoRepository;
import br.com.alurachallenge.alurachallenge.services.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class VideoServiceImpl implements VideoService{

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<VideoResponseDTO> findAll() {
        List<VideoResponseDTO> videoResponseDTOList =  new ArrayList<>();
        for (VideoEntity videoEntity : videoRepository.findAll()) {
            videoResponseDTOList.add(convertEntityToDTO(videoEntity));
        }
        return videoResponseDTOList;
    }

    @Override
    public VideoResponseDTO findById(Long id) {
        return convertEntityToDTO(videoRepository.findById(id).orElse(new VideoEntity()));
    }

    @Override
    public VideoResponseDTO save(VideoRequestDTO videoRequestDTO) {
        if(videoRequestDTO.getCategoryId() == null) {
            videoRequestDTO.setCategoryId(1L);
        }
        return convertEntityToDTO(videoRepository.save(convertDTOToEntity(videoRequestDTO)));
    }

    @Override
    public VideoResponseDTO update(Long id, VideoRequestDTO videoRequestDTO) {
        findById(id);
        videoRequestDTO.setId(id);
        return convertEntityToDTO(videoRepository.save(convertDTOToEntity(videoRequestDTO)));
    }

    @Override
    public void deleteById(Long id) {
        videoRepository.deleteById(id);
    }

    private VideoResponseDTO convertEntityToDTO(VideoEntity videoEntity) {
        return modelMapper.map(videoEntity, VideoResponseDTO.class);
    }

    private VideoEntity convertDTOToEntity(VideoRequestDTO videoRequestDTO) {
        return modelMapper.map(videoRequestDTO, VideoEntity.class);
    }
}
