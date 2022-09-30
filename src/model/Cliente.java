package model;

import helper.Utils;

import java.util.Date;

public class Cliente {

    private static int contador = 101;

    private int codigo;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Date dataCadastro;

    public Cliente(String nome, String email, String cpf, Date dataNascimento) {
        this.codigo = Cliente.contador;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = new Date();
        Cliente.contador += 1;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataCadastro() {
        return this.dataCadastro;
    }

    public String toString(){
        return "Código: " + this.getCodigo() +
                "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nE-mail: " + this.getEmail() +
                "\nData de Nascimento: " + Utils.dateParaString(this.getDataNascimento()) +
                "\nData de Cadastro: " + Utils.dateParaString(this.getDataCadastro());
    }
}
/*
    Linha 5 -> Toda vez que estaciar um objeto da classe ele vai receber como codigo o contador e vai incrementar.
    Linha 13 e 14 -> Importamos o Date do (java.util).
    Linha 16 a 24 -> Temos as constructors.
    Linha 26 a 62 -> Temos os getters e setters.
    Linha 64 a 70 -> Temos o metodo toString -> Para ter dados e apresentar nossos objetos

*/