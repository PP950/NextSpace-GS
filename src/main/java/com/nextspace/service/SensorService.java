package com.nextspace.service;

import com.nextspace.dto.SensorDTO;
import com.nextspace.entity.Satelite;
import com.nextspace.entity.Sensor;
import com.nextspace.exception.RecursoNaoEncontradoException;
import com.nextspace.repository.SateliteRepository;
import com.nextspace.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;
    private final SateliteRepository sateliteRepository;

    public SensorService(SensorRepository repository,
                         SateliteRepository sateliteRepository) {

        this.repository = repository;
        this.sateliteRepository = sateliteRepository;
    }

    public Sensor salvar(SensorDTO dto) {

        Sensor sensor = new Sensor();

        Satelite satelite = sateliteRepository.findById(dto.sateliteId())
                .orElseThrow(() ->
                        new RecursoNaoEncontradoException("Satélite não encontrado"));

        sensor.setTipo(dto.tipo());
        sensor.setValorCaptado(dto.valorCaptado());
        sensor.setDescricaoLeitura(dto.descricaoLeitura());
        sensor.setAtivo(dto.ativo());

        sensor.setSatelite(satelite);

        return repository.save(sensor);
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor buscarporId(Long id){
        return repository.findById(id)
                .orElseThrow(() ->
                        new RecursoNaoEncontradoException("Sensor não encontrado"));
    }

    public Sensor Atuailizar(Long id, SensorDTO sensorAtualizado){

        Sensor sensor = buscarporId(id);

        sensor.setAtivo(sensorAtualizado.ativo());
        sensor.setValorCaptado(sensorAtualizado.valorCaptado());
        sensor.setDescricaoLeitura(sensorAtualizado.descricaoLeitura());

        return repository.save(sensor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}