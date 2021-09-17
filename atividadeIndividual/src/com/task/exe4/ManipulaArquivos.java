package com.task.exe4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ManipulaArquivos {

    public void OrdemString() throws IOException {

        String str;
        BufferedReader in = new BufferedReader(new FileReader("arquivo.txt"));
        ArrayList<String> lista = new ArrayList<String>();

        while ((str = in.readLine()) != null) {
            lista.add(str);
        }
        in.close();

        Collections.sort(lista);

        BufferedWriter out = new BufferedWriter(new FileWriter("arquivo1.txt"));
        for (int i = 0; i < lista.size(); i++) {
            out.write(lista.get(i));
            out.newLine();
        }
        out.close();

        System.out.println("Fez a leitura do arquivo nome.txt e criou o arquivo conteudo.txt Ordenado");

    }

}
