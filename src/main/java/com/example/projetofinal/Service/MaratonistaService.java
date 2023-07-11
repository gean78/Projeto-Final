package com.example.projetofinal.Service;

import com.example.projetofinal.Entity.Maratonista;
import com.example.projetofinal.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {

        @Autowired
        private MaratonistaRepository maratonistaRepository;

        public Maratonista salvarMaratonista(Maratonista maratonista){
            return maratonistaRepository.save(maratonista);
        }
    public Maratonista buscarMaratonista(Long id){

            return maratonistaRepository.findById(id).get();
    }

    public List<Maratonista> buscarMaratonistas(){
        return maratonistaRepository.findAll();
    }

}
