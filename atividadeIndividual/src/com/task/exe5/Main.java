package com.task.exe5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exercício 5
        String nome, cpf, email, telefone;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Entre com o seu cpf (Ex:999.999.999-99");
        cpf = teclado.nextLine();

        System.out.println("Entre com o seu email: ");
        email = teclado.nextLine();

        System.out.println("Finalmente, entre com o seu telefone: ");
        telefone = teclado.nextLine();

        boolean checknome       = Cliente.nomeValido(nome);
        boolean checkcpf        = Cliente.cpfValido(cpf);
        boolean checkemail      = Cliente.emailValido(email);
        boolean checktelefone   = Cliente.telefoneValido(telefone);

        if (checknome == true ){
            System.out.println("Cliente Válido!");
        } else {
            System.out.println("Cliente não pode ser cadastrado!");
        }
    }
}
