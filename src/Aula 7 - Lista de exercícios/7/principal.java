package pkg;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto a = new Produto();
		a.nome = "Livro";
		a.preco = 45.5;
		a.quantidade = 3;
		
		Produto b = new Produto();
		System.out.println("Nome do produto: ");
		b.nome = teclado.nextLine();
		System.out.println("Preço do produto: R$");
		b.preco = teclado.nextDouble();
		System.out.println("Quantidade de produtos: ");
		b.quantidade = teclado.nextInt();
		
		teclado.close();
		
		a.exibirInformacoes();
		a.calcularValorTotal();
		
		b.exibirInformacoes();
		b.calcularValorTotal();
	}

}
