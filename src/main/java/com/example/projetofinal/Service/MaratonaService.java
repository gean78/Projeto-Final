package com.example.projetofinal.Service;

import com.example.projetofinal.Entity.Maratona;
import com.example.projetofinal.Entity.Maratonista;
import com.example.projetofinal.Repository.MaratonaRepository;
import com.example.projetofinal.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaratonaService {
    @Autowired
    private MaratonaRepository maratonaRepository;

    public Maratona salvarMaratona(Maratona maratona){

        return maratonaRepository.save(maratona);
    }
    public Maratona buscarMaratona(Long id){

        return maratonaRepository.findById(id).get();
    }

    public List<Maratona> buscarMaratonas(){

        return maratonaRepository.findAll();
    }

}

