package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Maratona;
import com.example.projetofinal.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MaratonaController {
        @Autowired
        private MaratonaService maratonaService ;

        @PostMapping("salvamaratona")
        public ResponseEntity<Maratona> salvarMaratona(@RequestBody Maratona maratona ) {
            return ResponseEntity.status(HttpStatus.CREATED).body(maratonaService.salvarMaratona(maratona));
        }

        @GetMapping("maratona/{id}")
        public ResponseEntity<Maratona> buscarmaratona(@PathVariable Long id) {
            Maratona maratona = maratonaService.buscarMaratona(id);
            if (maratona == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Maratona não encontrado");
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(maratona);
            }
        }

        @GetMapping("maratonas")
        public ResponseEntity<List<Maratona>> buscarmaratonas() {
            return ResponseEntity.status(HttpStatus.OK).body(maratonaService.buscarMaratonas());
        }
    }

