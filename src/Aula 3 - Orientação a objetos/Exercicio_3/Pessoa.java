package Exercicio_3;

import java.util.Scanner;

public class Pessoa {
	public String nome;
	public int idade;
	public String genero;
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		p.nome = sc.nextLine();
		System.out.println("Idade: ");
		p.idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Genero: ");
		p.genero = sc.nextLine();
		
		System.out.println("\nNome:"+p.nome);
		System.out.println("Idade:"+p.idade);
		System.out.println("Genero:"+p.genero);
	}
	
}
