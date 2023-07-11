package com.example.projetofinal.Service;

import com.example.projetofinal.Entity.Circuito;
import com.example.projetofinal.Entity.Maratona;
import com.example.projetofinal.Repository.CircuitoRepository;
import com.example.projetofinal.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    @Autowired
    private CircuitoRepository circuitoRepository;

    public Circuito salvarCircuito(Circuito circuito){
        return circuitoRepository.save(circuito);
    }
    public Circuito buscarCircuito(Long id){

        return circuitoRepository.findById(id).get();
    }

    public List<Circuito> buscarCircuitos(){
        return circuitoRepository.findAll();
    }

}

