package com.task.exe4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ManipulaArquivos arq = new ManipulaArquivos();

        try {
            arq.OrdemString();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
