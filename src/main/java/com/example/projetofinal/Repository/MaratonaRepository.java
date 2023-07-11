package com.example.projetofinal.Repository;

import com.example.projetofinal.Entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonaRepository extends JpaRepository<Maratona, Long > {
}
