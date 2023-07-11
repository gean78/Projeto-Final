package com.example.projetofinal.Repository;

import com.example.projetofinal.Entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long > {
}
