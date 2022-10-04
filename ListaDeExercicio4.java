package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota:");
		n2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota:");
		n3 = entrada.nextDouble();
		System.out.println("Digite a quarta nota:");
		n4 = entrada.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A média do aluno é: " + media);
		
		entrada.close();
	}

}
