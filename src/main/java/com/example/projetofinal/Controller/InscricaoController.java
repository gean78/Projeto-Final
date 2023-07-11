package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Circuito;
import com.example.projetofinal.Entity.Inscricao;
import com.example.projetofinal.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class InscricaoController {
        @Autowired
        private InscricaoService inscricaoService ;

        @PostMapping("salvainscricao")
        public ResponseEntity<Circuito> salvarInscricao(@RequestBody Inscricao inscricao ) {

            return ResponseEntity.status(HttpStatus.CREATED).body(inscricaoService.salvarInscricao(inscricao));
        }

        @GetMapping("maratona/{id}")
        public ResponseEntity<Circuito> buscarinscricao(@PathVariable Long id) {
            Circuito inscricao = inscricaoService.buscarInscricao(id);
            if (inscricao == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Inscricao não encontrado");
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(inscricao);
            }
        }

        @GetMapping("inscricaos")
        public ResponseEntity<List<Circuito>> buscarinscricaos() {

            return ResponseEntity.status(HttpStatus.OK).body(inscricaoService.buscarInscricao().get());
        }

    }

