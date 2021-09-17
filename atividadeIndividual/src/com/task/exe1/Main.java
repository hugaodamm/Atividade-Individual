package com.task.exe1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Hugo", "Rua A", "(21) 9 9134-3456", 29, 1.75));
        pessoas.add(new Pessoa("Gabriel", "Rua B", "(21) 9 9999-7809", 28, 1.74));
        pessoas.add(new Pessoa("Marcelo", "Rua C", "(21) 9 8765-2345", 34, 1.70));
        pessoas.add(new Pessoa("Rafael", "Rua D", "(21) 9 78693467", 27, 1.68));
        pessoas.add(new Pessoa("Ernani", "Rua E", "(21) 9 9876-3467", 32, 1.73));
        pessoas.add(new Pessoa("Joana", "Rua F", "(21) 9 7657-3467", 32, 1.73));
        pessoas.add(new Pessoa("Thamires", "Rua G", "(21) 9 9134-3456", 20, 1.65));
        pessoas.add(new Pessoa("Camila", "Rua H", "(21) 9 9134-3456", 23, 1.69));
        pessoas.add(new Pessoa("Mariana", "Rua I", "(21) 9 9134-3456", 25, 1.67));
        pessoas.add(new Pessoa("Caroline", "Rua J", "(21) 9 9134-3456", 29, 1.67));

        for (Pessoa pessoaLista : pessoas){
            agenda.armazenarPessoa(pessoaLista);
        }

        // Pessoas adicionadas
        System.out.println("\n*** Pessoas Armazenadas ***\n");
        agenda.exibirTodaAgenda();

        // Remova uma pessoa da lista
        System.out.println("\n*** Remover uma pessoa da lista - Exemplo: Joana ***\n");
        agenda.removerPessoa("Joana");
        agenda.exibirTodaAgenda();

        // Busque uma pessoa na lista pelo seu nome
        System.out.println("\n*** Buscar uma pessoa - Exemplo: Caroline ***\n");
        System.out.println("Posição: " + agenda.buscarPessoa("Caroline"));

        // Apresente todas as pessoas que estão na agenda
        System.out.println("\n*** Lista completa ***\n");
        agenda.exibirTodaAgenda();

        // Apresente uma pessoa em específico
        System.out.println("\n*** Pessoa em específico - Exemplo: Posição 0 ***\n");
        agenda.exibirPessoa(0);

        // Lista de pessoas em ordem alfabética = DE NOME
        System.out.println("\n*** Plus - Lista de Pessoas em ordem alfabética de Nome ***\n");
        agenda.listarPessoasEmOrdemAlfabéticaDeNome( );

        // Lista de pessoas em ordem alfabética = DE ENDEREÇO
        System.out.println("\n*** Plus - Lista de Pessoas em ordem alfabética de Endereço ***\n");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco( );

        // Lista de pessoas em ordem decrescente = POR IDADE
        System.out.println("\n*** Plus - Lista de pessoas em ordem decrescente de Idade ***\n");
        agenda.listarPessoasPorIdade( );
    }

}
