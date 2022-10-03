package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {
    public static void main(String[] args) {
        Cliente erica = new Cliente("Erica",
                "erica@erica.com",
                "123.123.123-12",
                Utils.stringParaData("17/09/1900"));

        Cliente maria = new Cliente("Maria",
                "maria@maria.com",
                "132.123.134-23",
                Utils.stringParaData("12/02/1990"));

        Cliente othon = new Cliente("Othon",
                "othon@othon.com",
                "234.345.456-45",
                Utils.stringParaData("23/04/1989"));

    /*  System.out.println(erica);
        System.out.println(maria);
        System.out.println(othon);
    */
        Conta c101 = new Conta(erica);
        Conta c102 = new Conta(maria);

        // Depositando um valor positivo

       /* c101.depositar(500.00);
        c102.depositar(500.00);

        System.out.println(c101);
        System.out.println();
        System.out.println(c102);*/

        // Depositando um valor 0

        /*c101.depositar(0.00);
        c102.depositar(0.00);

        System.out.println(c101);
        System.out.println();
        System.out.println(c102);*/

        // Testando sacar valor no saldo suficiente

        //c101.sacar(300);

        //Testando sacar valor 0
        //c101.sacar(0.0);

        //Testando sacar valor negativo
        // c101.sacar(-100);
        //c102.sacar(-100);

        //Setando um limite para a c101
        c101.setLimite(200.00);

        //Testando sacar um valor maoir que o saldo
        c101.sacar(600.00);

        System.out.println(c101);
        System.out.println();





    }
}
