package Exercicios;
import java.util.Scanner;

public class Main_Carro {

	public static void main(String[] args) {
	Carro c = new Carro();
	Carro c2 = new Carro();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Carro 1:");
	System.out.println("Marca: ");
	c.marca = sc.nextLine();
	System.out.println("Modelo: ");
	c.modelo = sc.nextLine();
	System.out.println("Ano de Fabricação: ");
	c.ano_fab = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Carro 2:");
	System.out.println("Marca: ");
	c2.marca = sc.nextLine();
	System.out.println("Modelo: ");
	c2.modelo = sc.nextLine();
	System.out.println("Ano de Fabricação: ");
	c2.ano_fab = sc.nextInt();

	
	System.out.println("Carro 1:");
	System.out.println("Marca: "+c.marca);
	System.out.println("Modelo: "+c.modelo);
	System.out.println("Ano de Fabricação: "+c.ano_fab);
	sc.nextLine();
	
	System.out.println("Carro 2:");
	System.out.println("Marca: "+c2.marca);
	System.out.println("Modelo: "+c2.modelo);
	System.out.println("Ano de Fabricação: "+c2.ano_fab);



	
	
	}

}
