package com.gdminvest.gdmInvest.controllers;

import com.gdminvest.gdmInvest.models.Ativo;
import com.gdminvest.gdmInvest.repository.AtivoRepository;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/ativos")
public class AtivoController {

    @Autowired
    private AtivoRepository repository;

    @GetMapping("/all")
    public List<Ativo> listaAtivos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Ativo ativo(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/new")
    public ResponseEntity<Ativo> novo(@Valid @RequestBody Ativo ativo) {
        Optional<Ativo> ativoOpt = Optional.ofNullable(repository.getAtivoByTicket(ativo.getTicket()));

        return ativoOpt.isEmpty()
                ? new ResponseEntity<>(repository.save(ativo), HttpStatus.CREATED)
                : ResponseEntity.ok(ativoOpt.get());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
