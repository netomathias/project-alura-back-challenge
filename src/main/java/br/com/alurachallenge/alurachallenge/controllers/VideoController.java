package br.com.alurachallenge.alurachallenge.controllers;

import br.com.alurachallenge.alurachallenge.dtos.requests.VideoRequestDTO;
import br.com.alurachallenge.alurachallenge.dtos.responses.VideoResponseDTO;
import br.com.alurachallenge.alurachallenge.facades.VideoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoFacade videoFacade;

    @GetMapping
    public List<VideoResponseDTO> findAll() {
        return videoFacade.findAll();
    }

    @GetMapping("/{id}")
    public VideoResponseDTO findById(@PathVariable Long id) {
        return videoFacade.findById(id);
    }

    @PostMapping
    public VideoResponseDTO save(@RequestBody @Valid VideoRequestDTO videoRequestDTO) {
        return videoFacade.save(videoRequestDTO);
    }

    @PutMapping("/{id}")
    public VideoResponseDTO update(@PathVariable Long id, @RequestBody @Valid VideoRequestDTO videoRequestDTO) {
        return videoFacade.update(id, videoRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        videoFacade.delete(id);
    }
}
