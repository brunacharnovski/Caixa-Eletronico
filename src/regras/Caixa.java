/*
* @autor Bruna Charnovski
*/
package regras;

public class Caixa {

    public float quantiaDinheiro;
    public int numeroSaque;
    public int numeroDeposito;

    public void sacar(float saque) {
        if (saque > quantiaDinheiro) {
            System.out.println("Saldo Insuficiente");
            System.out.println(" ");
        } else {
            numeroSaque = numeroSaque + 1;
            quantiaDinheiro = quantiaDinheiro - saque;
            //System.out.println("Saque no valor R$" + saque + " realizado. Você realizou " + numeroSaque + " saques");
            //System.out.println(" ");
        }
    }
    public void depositar(float deposito) {
        numeroDeposito = numeroDeposito + 1;
        quantiaDinheiro = quantiaDinheiro + deposito;
        //System.out.println("Depósito no valor R$ " + deposito + " realizado. Você realizou " + numeroDeposito + " depositos");
        //System.out.println(" ");
    }
}
