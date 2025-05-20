package pkg;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	int i=0;
	
	for(;;) {
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
			if(n==0) {
				break;
	}
	 
	}
	System.out.println("Programa finalizado.");
    sc.close();
}
}