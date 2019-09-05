/*
* @autor Bruna Charnovski
*/
package testes;

import regras.Caixa;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Caixa caixa;
        caixa = new Caixa();
        System.out.println("Digite o valor a ser depositado no caixa 1");
        float valordeposito = teclado.nextFloat();
        caixa.depositar(valordeposito);
        System.out.println("Digite o valor a ser sacado no caixa 1");
        float valorsaque = teclado.nextFloat();
        caixa.sacar(valorsaque);
        System.out.println("Saldo R$" + caixa.quantiaDinheiro);

       
        Caixa caixa2;
        caixa2 = new Caixa();
        System.out.println("Digite o valor a ser depositado no caixa 2");
        valordeposito = teclado.nextFloat();
        caixa2.depositar(valordeposito);
        System.out.println("Digite o valor a ser sacado no caixa 2");
        caixa2.sacar(teclado.nextFloat());
        System.out.println("Saldo R$" + caixa2.quantiaDinheiro);

    }

}
