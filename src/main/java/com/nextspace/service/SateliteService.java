package com.nextspace.service;

import com.nextspace.dto.SateliteDTO;
import com.nextspace.entity.Satelite;
import com.nextspace.exception.RecursoNaoEncontradoException;
import com.nextspace.repository.SateliteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SateliteService {

    private final SateliteRepository repository;

    public SateliteService(SateliteRepository repository) {
        this.repository = repository;
    }

    public Satelite salvar(SateliteDTO dto) {

        Satelite satelite = new Satelite();

        satelite.setNome(dto.nome());
        satelite.setFabricante(dto.fabricante());
        satelite.setDataLancamento(dto.dataLancamento());

        satelite.setOrbita(dto.orbita());
        satelite.setVersaoSoftware(dto.versaoSoftware());
        satelite.setAtivo(dto.ativo());

        return repository.save(satelite);
    }

    public List<Satelite> listarTodos() {
        return repository.findAll();
    }

    public Satelite buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Satélite não encontrado"));    }

    public Satelite atualizar(Long id, SateliteDTO sateliteAtualizado) {

        Satelite satelite = buscarPorId(id);

        satelite.setNome(sateliteAtualizado.nome());
        satelite.setFabricante(sateliteAtualizado.fabricante());
        satelite.setDataLancamento(sateliteAtualizado.dataLancamento());

        satelite.setOrbita(sateliteAtualizado.orbita());
        satelite.setVersaoSoftware(sateliteAtualizado.versaoSoftware());
        satelite.setAtivo(sateliteAtualizado.ativo());

        return repository.save(satelite);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}