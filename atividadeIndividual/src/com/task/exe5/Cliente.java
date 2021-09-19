package com.task.exe5;

public class Cliente {

    private static int id=0;
    String nome, cpf, endereco, email, telefone;

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public int getId() {
        return id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static boolean nomeValido (String nome){
        boolean checkNome = (nome.length()>3 && nome.length()<50) ? true : false;
        return checkNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static boolean cpfValido (String cpf){
        String cpfFormato = cpf.replace(".","").replace("-","");
        boolean checkCPF = (cpfFormato.length()==11)? true : false;
        return checkCPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean emailValido(String email){
        boolean checkEmail = (email.contains("@")) ? true : false;
        return checkEmail;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static boolean telefoneValido(String telefone){
        String checkTel = telefone.replace(" ", "").replace("-","");
        boolean resultado = (checkTel.length()==11)? true : false;
        return resultado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

}
