package model;

import helper.Utils;

import java.util.Date;

public class Conta {
    private static int codigo = 1001;
    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;
    private Double saldoTotal;

    public Conta(Cliente cliente) {
        this.numero = Conta.codigo;
        this.cliente = cliente;
        Conta.codigo += 1;
        this.atualizaSaldoTotal();

    }

    public static int getCodigo() {
        return codigo;
    }
    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
        this.atualizaSaldoTotal();
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }
    private void atualizaSaldoTotal(){
        this.saldoTotal = this.getSaldo() + this.getLimite();
    }

    public String toString(){
        return "Numero da Conta: " + this.getNumero() +
                "\nCliente: " + this.cliente.getNome() +
                "\nSaldo Total: " + Utils.doubleParaString(this.getSaldoTotal());
    }

    public void depositar(Double valor){
        if(valor > 0){
            this.saldo = this.getSaldo() + valor;
            this.atualizaSaldoTotal();
            System.out.println("Deposito realizado com sucesso!");
        }else {
            System.out.println("Erro ao efetuar depósito.Tente novamente.");
        }
    }

    public void sacar(Double valor){
        if(valor > 0 && this.getSaldoTotal() >= valor){
            if(this.getSaldo() >= valor){
                this.saldo = this.getSaldo() - valor;
                this.atualizaSaldoTotal();
                System.out.println("Operação realizada com sucesso! ");
            }else {
                Double restante = this.getSaldo() - valor;
                this.limite = this.getLimite() - restante;
                this.saldo = 0.0;
                this.atualizaSaldoTotal();
                System.out.println("Operação realizada com sucesso! ");
            }
        }else {
            System.out.println("Operação não realizada!");
        }
    }

    public void transferir(Conta destino, Double valor){
        if(valor > 0 && this.getSaldoTotal() >= valor){
            if(this.getSaldo() >= valor){
                this.saldo = this.getSaldo() - valor;
                destino.saldo = destino.getSaldo() + valor;
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Operação realizada com sucesso! ");
            }else {
                Double restante = this.getSaldo() - valor;
                this.limite = this.getLimite() - restante;
                this.saldo = 0.0;
                destino.saldo = destino.getSaldo() + valor;
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Operação realizada com sucesso! ");

            }

        }else {
            System.out.println("Operação não realizada!");
        }
    }
}
/*

    Linha 4 -> Informa que o codigo da conta vai comecar apartir do 1001.
    Linha 13 a 17 -> Constructor cliente e o numero da conta onde começa com 1001 e vai incrementando em 1.
    Linha 19 a 52 -> São os getters e setters.
    Linha 55 a 58 -> Criamos um metodo para calcular o saldo total.
    Linha 61 a 65 -> Temos o metodo toString -> Para ter dados e apresentar nossos objetos.
    Linha 67 a 74  -> Metodo para o cliente efetuar deposito.
    Linha 77 a 94 -> Metodo para o cliente sacar o valor desejado se somente se existir saldo.
    Linha 96 a 118 -> Metodo para o cliente transferir valor para outra conta se somente se existir saldo.

*/