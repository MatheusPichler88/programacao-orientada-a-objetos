package Aula_12.Ex4;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Conta c, double valor){
        c.saldo += valor;
    }
    public void mostrarDados(){
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
