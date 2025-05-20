import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        nome = nome;
        idade = idade;
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    Pessoa(int idade) {
        idade = idade;
        System.out.println("Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o construtor:");
        System.out.println("1 - Nome e Idade");
        System.out.println("2 - Apenas Idade");

        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            Pessoa p1 = new Pessoa(nome, idade);
        } else if (escolha == 2) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            Pessoa p2 = new Pessoa(idade);
        } else {
            System.out.println("Invalido.");
        }

        sc.close();
    }
}