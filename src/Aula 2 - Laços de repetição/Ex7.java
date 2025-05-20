package pkg;
import java.util.Scanner;
public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.println("Digite a nota do aluno: ");
            int nota = sc.nextInt();
            
            if(nota == -1) {
                break;
            }
            
            System.out.println("Nota registrada: "+nota);
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
