import java.util.Scanner;

class Aluno {
    String nome;
    String matricula;
    String dataNasc;
    int anoIngresso;

    Aluno(String nome, String matricula) {
        nome = nome;
        matricula = matricula;
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }

    Aluno(String dataNasc) {
        dataNasc = dataNasc;
        System.out.println("Data de Nascimento: " + dataNasc);
    }

    Aluno(String nome, String dataNasc, int anoIngresso) {
        nome = nome;
        dataNasc = dataNasc;
        anoIngresso = anoIngresso;
        System.out.println("Nome: " + nome + ", Data de Nascimento: " + dataNasc + ", Ano de Ingresso: " + anoIngresso);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno 1: ");
        String nome1 = sc.nextLine();
        System.out.print("Matrícula do aluno 1: ");
        String matricula1 = sc.nextLine();
        Aluno aluno1 = new Aluno(nome1, matricula1);

        System.out.print("Data de nascimento do aluno 2: ");
        String dataNasc2 = sc.nextLine();
        Aluno aluno2 = new Aluno(dataNasc2);

        System.out.print("Nome do aluno 3: ");
        String nome3 = sc.nextLine();
        System.out.print("Data de nascimento do aluno 3: ");
        String dataNasc3 = sc.nextLine();
        System.out.print("Ano de ingresso do aluno 3: ");
        int anoIngresso3 = sc.nextInt();
        Aluno aluno3 = new Aluno(nome3, dataNasc3, anoIngresso3);

        sc.close();
    }
}