import java.util.Scanner;

public class IndiceMassaCorporea {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL: ");
				
		System.out.println("Digite seu peso (em kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura (em metros): ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		System.out.println("Seu IMC é: " + indiceMassaCorporal);
		
		scanner.close();
 		
	}

}
