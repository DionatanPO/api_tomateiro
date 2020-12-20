package com.example.api_tomateiro.controller;

import com.example.api_tomateiro.model.Safra;
import com.example.api_tomateiro.service.SafraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/safra/")
public class SafraController {

    @Autowired
    SafraService safraService;

    @PostMapping()
    public ResponseEntity<Safra> cadastrar(@RequestBody Safra safra) {


        Safra safraSalvo = safraService.salvar(safra);

        return new ResponseEntity<>(safraSalvo, HttpStatus.CREATED);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Safra> editar(@RequestBody Safra safra) {

        Safra safraSalvo = safraService.salvar(safra);

        return ResponseEntity.ok(safraSalvo);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity deletar(@PathVariable Long id) {

        Safra safra = new Safra();
        safra.setId(id);
        safraService.delete(safra);

        return ResponseEntity.ok().build();

    }

    @GetMapping(value = "todos")
    public ResponseEntity<List<Safra>> mostrarTodos() {

        List safraList = safraService.buscarTodos();

        return new ResponseEntity<>(safraList, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Safra> buscaPorID(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(safraService.buscaPorID(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
