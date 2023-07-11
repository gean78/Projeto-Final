package com.example.projetofinal.Repository;

import com.example.projetofinal.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratonista, Long> {


}
