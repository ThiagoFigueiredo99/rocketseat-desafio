package com.rocketseat.desafio.controller;

import com.rocketseat.desafio.model.Desafio;
import com.rocketseat.desafio.service.DesafioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class DesafioController {

    @Autowired
    private DesafioService desafioService;

    @PostMapping
    public Desafio createDesafio(@RequestBody Desafio desafio) {
        return desafioService.createDesafio(desafio);
    }

    @GetMapping
    public List<Desafio> getAllDesafios() {
        return desafioService.getAllDesafios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Desafio> getDesafioById(@PathVariable Long id) {
        return desafioService.getDesafioById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Desafio> updateDesafio(@PathVariable Long id, @RequestBody Desafio desafioDetails) {
        return ResponseEntity.ok(desafioService.updateDesafio(id, desafioDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesafio(@PathVariable Long id) {
        desafioService.deleteDesafio(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/active")
    public ResponseEntity<Desafio> toggleDesafioActive(@PathVariable Long id) {
        return ResponseEntity.ok(desafioService.toggleDesafioActive(id));
    }
}
