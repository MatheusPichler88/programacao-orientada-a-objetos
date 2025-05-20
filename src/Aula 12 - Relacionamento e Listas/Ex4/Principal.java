//4 - Crie uma classe Conta com os atributos titular e saldo.
// Crie um método depositar(Conta c, double valor) que receba a conta como parâmetro e aumente o saldo.
package Aula_12.Ex4;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Matheus", 3000);
        Conta conta2 = new Conta("Maria", 7200);

        conta1.mostrarDados();
        conta2.mostrarDados();

        conta1.depositar(conta2, 837);
        conta1.mostrarDados();
        conta2.mostrarDados();
    }
}
