package com.gdminvest.gdmInvest.controllers;

import com.gdminvest.gdmInvest.models.Carteira;
import com.gdminvest.gdmInvest.repository.CarteiraRespository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/carteiras")
public class CarteiraController {

    @Autowired
    private CarteiraRespository repository;

    @GetMapping("/all")
    public List<Carteira> listaCarteiras() {
        return repository.findAll();
    }

    @PostMapping("/new")
    public void nova(@Valid @RequestBody Carteira c) {
        repository.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
