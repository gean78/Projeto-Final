package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Maratonista;
import com.example.projetofinal.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MaratonistaController {
    @Autowired
    private MaratonistaService maratonistaService ;

    @PostMapping("salvamaratonista")
    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));
    }

    @GetMapping("maratonista/{id}")
    public ResponseEntity<Maratonista> buscarmaratonista(@PathVariable Long id) {
        Maratonista maratonista = maratonistaService.buscarMaratonista(id);
        if (maratonista == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Maratonista não encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(maratonista);
        }
    }

    @GetMapping("maratonistas")
    public ResponseEntity<List<Maratonista>> buscarmaratonistas() {
        return ResponseEntity.status(HttpStatus.OK).body(maratonistaService.buscarMaratonistas());
    }
}
