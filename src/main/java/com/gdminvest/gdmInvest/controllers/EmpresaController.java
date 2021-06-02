
package com.gdminvest.gdmInvest.controllers;

import com.gdminvest.gdmInvest.models.Empresa;
import com.gdminvest.gdmInvest.repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/empresas")
public class EmpresaController {
    
    @Autowired
    private EmpresaRepository repository;
    
    @GetMapping("/all")
    public List<Empresa> list() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Empresa get(@PathVariable Long id) {
        return repository.getById(id);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Empresa input) {
        return ResponseEntity.ok(repository.save(input));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        repository.deleteById(id);
        return (ResponseEntity<?>) ResponseEntity.accepted();
    }
    
}
