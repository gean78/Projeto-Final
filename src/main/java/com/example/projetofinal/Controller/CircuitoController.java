package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Circuito;
import com.example.projetofinal.Entity.Maratona;
import com.example.projetofinal.Service.CircuitoService;
import com.example.projetofinal.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CircuitoController {
        @Autowired
        private CircuitoService circuitoService ;

        @PostMapping("salvacircuito")
        public ResponseEntity<Circuito> salvarCircuito(@RequestBody Circuito circuito ) {
            return ResponseEntity.status(HttpStatus.CREATED).body(circuitoService.salvarCircuito(circuito));
        }

        @GetMapping("circuito/{id}")
        public ResponseEntity<Circuito> buscarmcircuito(@PathVariable Long id) {
            Circuito circuito = circuitoService.buscarCircuito(id);
            if (circuito == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Circuito não encontrado");
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(circuito);
            }
        }

        @GetMapping("circuitos")
        public ResponseEntity<List<Circuito>> buscarcircuitos() {
            return ResponseEntity.status(HttpStatus.OK).body(circuitoService.buscarCircuitos());
        }
    }

