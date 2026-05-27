package com.nextspace.controller;

import com.nextspace.dto.SensorDTO;
import com.nextspace.entity.Sensor;
import com.nextspace.service.SensorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
    public Sensor salvar(@RequestBody @Valid SensorDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<Sensor> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return service.buscarporId(id);
    }

    @PutMapping("/{id}")
    public Sensor atualizar(@PathVariable Long id,
                            @RequestBody @Valid SensorDTO dto) {

        return service.Atuailizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}