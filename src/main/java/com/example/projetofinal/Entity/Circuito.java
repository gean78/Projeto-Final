package com.example.projetofinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Circuito {
    @Id

    private Long id;
    private int distancia;

    @JsonIgnore
    @OneToMany(mappedBy = "circuito")
    private List<Inscricao> inscricaos;

    @ManyToOne
    private Maratona maratona;
}
