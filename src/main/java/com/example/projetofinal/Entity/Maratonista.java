package com.example.projetofinal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Maratonista {

    @Id
    private Long id;
    private int idade;
    private String grupo_sanguineo;
    private String nome;
    private int numero_telefone;
    private int numero_emergencia;
    private int rg;
    private String sobrenome;

    @JsonIgnore
    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricaos;

}
