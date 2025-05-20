import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        retangulo.setBase(base);

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        retangulo.setAltura(altura);

        double area = retangulo.calculaArea();
        System.out.println("Área do retângulo: " + area);

        sc.close();
    }
}
