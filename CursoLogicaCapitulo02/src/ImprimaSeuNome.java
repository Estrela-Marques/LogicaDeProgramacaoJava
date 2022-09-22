import java.util.Scanner;

public class ImprimaSeuNome {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String seuNome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String seuSobrenome = scanner.next();
		
		System.out.println("Olá. " + seuNome + "" + seuSobrenome + ", seja bem-vindo(a)!");
		
		scanner.close();
	}

}
