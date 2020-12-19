package com.example.api_tomateiro.controller;

import com.example.api_tomateiro.model.Produtor;
import com.example.api_tomateiro.service.ProdutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtor/")
public class ProdutorController {

    @Autowired
    ProdutorService produtorService;

    @PostMapping()
    public ResponseEntity<Produtor> cadastrar(@RequestBody Produtor produtor) {


        Produtor produtorSalvo = produtorService.salvar(produtor);

        return new ResponseEntity<>(produtorSalvo, HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Produtor> editar(@RequestBody Produtor produtor) {

        Produtor produtorSalvo = produtorService.salvar(produtor);

        return ResponseEntity.ok(produtorSalvo);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity deletar(@PathVariable Long id) {

        Produtor produtor = new Produtor();
        produtor.setId(id);
        produtorService.delete(produtor);

        return ResponseEntity.ok().build();

    }

    @GetMapping(value = "todos")
    public ResponseEntity<List<Produtor>> mostrarTodos() {

        List produtorList = produtorService.buscarTodos();

        return new ResponseEntity<>(produtorList, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Produtor> buscaPorID(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(produtorService.buscaPorID(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
