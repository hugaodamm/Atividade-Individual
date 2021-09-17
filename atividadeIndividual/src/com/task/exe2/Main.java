package com.task.exe2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ManipulaString inversao = new ManipulaString();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String name = teclado.nextLine();

        System.out.println("\n*** Nome do Usuário de trás para frente ***\n");
        inversao.inverteString(name);


        System.out.println("Digite qualquer palavra ou frase");
        String palavra = teclado.nextLine();

        System.out.println("\n*** Verificação de Palíndromo ***\n");
        inversao.palíndromo(palavra);

    }
}
