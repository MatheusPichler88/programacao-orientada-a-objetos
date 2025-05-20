import java.util.Scanner;

class Disciplina {
    String nome;
    int cargaHoraria;
    String nomeProfessor;

    Disciplina(String n, int ch, String prof) {
        nome = n;
        cargaHoraria = ch;
        nomeProfessor = prof;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disciplina d = new Disciplina("Poo", 80, "Ricardo");

        System.out.println("Valores iniciais:");
        System.out.println("Disciplina: " + d.nome);
        System.out.println("Carga Horária: " + d.cargaHoraria + " horas");
        System.out.println("Professor: " + d.nomeProfessor);

        System.out.println("\nDigite os novos valores:");

        System.out.print("Nome da Disciplina: ");
        d.nome = sc.nextLine();

        System.out.print("Carga Horária: ");
        d.cargaHoraria = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do Professor: ");
        d.nomeProfessor = sc.nextLine();

        System.out.println("\nNovos Valores:");
        System.out.println("Disciplina: " + d.nome);
        System.out.println("Carga Horária: " + d.cargaHoraria + " horas");
        System.out.println("Professor: " + d.nomeProfessor);

        sc.close();
    }
}