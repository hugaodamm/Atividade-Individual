package com.task.exe2;

public class ManipulaString {

    public void inverteString(String nome){

        String reverse = new StringBuffer(nome).reverse().toString();
        String rev = reverse.toUpperCase();

        System.out.println("Original String     : " + nome);
        System.out.println("Invertido String    : " + rev);
    }

    public void palíndromo(String nome){

        String palavra = nome.replaceAll(" ","").toLowerCase();
        String palindromo = "";

        for(int i = palavra.length() -1; i >= 0; i--)
        {
            palindromo += palavra.charAt(i);
        }
        System.out.println("Palava ou frase: "+ palavra);
        System.out.println("Palindromo: "+ palindromo);
        System.out.println(palindromo.equals(palavra));

        if (palindromo.equals(palavra)){
            System.out.println("Resultado: É Palíndromo");
        } else
            System.out.println("Resultado: Não é Palíndromo");

    }
}
