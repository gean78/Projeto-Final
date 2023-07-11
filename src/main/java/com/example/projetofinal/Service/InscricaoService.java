package com.example.projetofinal.Service;

import com.example.projetofinal.Entity.Circuito;
import com.example.projetofinal.Entity.Inscricao;
import com.example.projetofinal.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;

    public Circuito salvarInscricao(Inscricao inscricao) {


        System.out.print("Informe a idade: ");
        Scanner scanner = null;
        int idade = scanner.nextInt();

        System.out.println("Informe a categoria ( Pequeno,  Médio,  Avançado): ");
        String categoria = scanner.next();

        double valorInscricao = 0;

        switch (categoria.toUpperCase()) {
            case "Pequeno":
                valorInscricao = (idade < 18) ? 1300 : 1500;
                break;
            case "Medio":
                valorInscricao = (idade < 18) ? 2000 : 2300;
                break;
            case "Grande":
                if (idade >= 18) {
                    valorInscricao = 2800;
                } else {
                    System.out.println("Inscrição não permitida para menores de 18 anos no Circuito Avançado.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Categoria inválida.");
                System.exit(0);
        }

        System.out.println("Valor da inscrição: R$ " + valorInscricao);

        scanner.close();
        return null;
    }

    public Circuito buscarInscricao(Long id){

        return inscricaoRepository.findById(id).get().getCircuito();
    }

    public List<Inscricao> buscarInscricao(){
        return inscricaoRepository.findAll();
    }
}
