package br.com.alurachallenge.alurachallenge.repositories;

import br.com.alurachallenge.alurachallenge.entities.VideoEntity;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<VideoEntity, Long> {
}
