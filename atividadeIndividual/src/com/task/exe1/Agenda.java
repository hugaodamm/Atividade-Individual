package com.task.exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {

    private List<Pessoa> listagemPessoa = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa){
        this.listagemPessoa.add(pessoa);

    }

    public void removerPessoa(String nome){

        for (int i=0; i < listagemPessoa.size(); i++){
            Pessoa p = listagemPessoa.get(i);

            if (p.getNome().equals(nome)){
                listagemPessoa.remove(p);
                break;
            }
        }
    }

    public int buscarPessoa(String nome) {
        int posicao = 0;

        for (int i=0; i < listagemPessoa.size(); i++){
            Pessoa p = listagemPessoa.get(i);

            if (p.getNome().equals(nome)){
                posicao = i;
            }
        }
        return posicao;
    }

    public void exibirTodaAgenda(){
        for (Pessoa pessoaLista : listagemPessoa){
            System.out.println(pessoaLista);
        }
    }

    public void exibirPessoa(int index) {
        System.out.println(listagemPessoa.get(index));
    }

    public void listarPessoasEmOrdemAlfabéticaDeNome(){
        List<Pessoa> pessoas = listagemPessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> a.getNome().compareTo(b.getNome()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }

    }

    public void listarPessoasEmOrdemAlfabeticaDeEndereco(){
        List<Pessoa> pessoas = listagemPessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> a.getEndereco().compareTo(b.getEndereco()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }

    public void listarPessoasPorIdade(){
        List<Pessoa> pessoas = listagemPessoa.stream()
                .sorted((Pessoa a, Pessoa b) -> b.getIdade().compareTo(a.getIdade()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }


}
