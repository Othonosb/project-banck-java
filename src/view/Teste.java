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
    }
}
