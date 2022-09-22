
public class NotaAluno {
	public static void main(String[] args) {
		
		Integer nota = 9;
		
		Boolean passouDeAno = nota >= 7;
		
		if (passouDeAno) {
			System.out.println("Sim! Ele(a) passou de ano.");
		} else {
			System.out.println("Não! Ele(a) não passou de ano.");
		}
	}

}
