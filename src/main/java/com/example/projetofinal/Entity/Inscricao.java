package com.example.projetofinal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Inscricao {

    @Id
    private Long id;
    private double valor_inscricao;

    @ManyToOne
    private Circuito circuito;

    @ManyToOne
    private Maratonista maratonista
            ;
}
