import java.util.Scanner;

public class CalcularQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado de " + " é " + quadrado + ".");
		
		scanner.close();
		
		
	}

}
