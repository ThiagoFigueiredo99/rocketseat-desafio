package com.rocketseat.desafio.service;

import com.rocketseat.desafio.model.Desafio;
import com.rocketseat.desafio.repository.DesafioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesafioService {

    @Autowired
    private DesafioRepository desafioRepository;

    public Desafio createDesafio(Desafio desafio) {
        return desafioRepository.save(desafio);
    }

    public List<Desafio> getAllDesafios() {
        return desafioRepository.findAll();
    }

    public Optional<Desafio> getDesafioById(Long id) {
        return desafioRepository.findById(id);
    }

    public Desafio updateDesafio(Long id, Desafio desafioDetails) {
        Desafio desafio = desafioRepository.findById(id).orElseThrow(() -> new RuntimeException("Desafio not found"));

        if (desafioDetails.getName() != null) {
            desafio.setName(desafioDetails.getName());
        }
        if (desafioDetails.getCategory() != null) {
            desafio.setCategory(desafioDetails.getCategory());
        }

        return desafioRepository.save(desafio);
    }

    public void deleteDesafio(Long id) {
        desafioRepository.deleteById(id);
    }

    public Desafio toggleDesafioActive(Long id) {
        Desafio desafio = desafioRepository.findById(id).orElseThrow(() -> new RuntimeException("Desafio not found"));
        desafio.setActive(!desafio.isActive());
        return desafioRepository.save(desafio);
    }
}
