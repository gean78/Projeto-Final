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
public class Maratona {
@Id
    private Long id;
private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "maratona")
    private List<Circuito> circuitos;
}
