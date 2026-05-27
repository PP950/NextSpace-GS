package com.nextspace.controller;

import com.nextspace.dto.SateliteDTO;
import com.nextspace.entity.Satelite;
import com.nextspace.service.SateliteService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/satelites")
public class SateliteController {

    private final SateliteService service;

    public SateliteController(SateliteService service) {
        this.service = service;
    }

    @PostMapping
    public Satelite salvar(@Valid @RequestBody SateliteDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<Satelite> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Satelite buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Satelite atualizar(@PathVariable Long id,
                              @Valid @RequestBody SateliteDTO dto) {

        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}