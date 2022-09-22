import java.util.Scanner;

public class ExercicioDesconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();
		
		System.out.print("Digite quantidade do produto: ");
		Double quantidadeDoProduto = scanner.nextDouble();
		
		Double valorSubtotal = valorDoProduto * quantidadeDoProduto;
		
		Boolean quantidadeMaiorOuIgualDez = quantidadeDoProduto >= 10;
		
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = valorSubtotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor total: " + valorTotalComDesconto);
		
		scanner.close();
 				
				
		
		
		
		
		
	}

}
