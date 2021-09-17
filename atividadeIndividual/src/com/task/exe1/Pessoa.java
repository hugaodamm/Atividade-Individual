package com.task.exe1;

public class Pessoa {

    String nome;
    String endereco;
    String telefone;
    Integer idade;
    double altura;

    public Pessoa(String nome, String endereco, String telefone, Integer idade, double altura) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return  "Nome= " + nome + " " +
                ", Endereco= " + endereco + " " +
                ", Telefone= " + telefone + " " +
                ", Idade= " + idade +
                ", Altura= " + altura;
    }
}
