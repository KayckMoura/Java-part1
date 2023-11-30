package Fundamentos;
import java.util.Scanner;

public class Aula02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite tres numero: ");
		
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		
		if ((n1 > n2) && (n1 > n3)) {
			if (n2 > n3) {
				System.out.println("O numero "+ n1 + " e o maior, e "+ n3 +"  o menor.");
			}
			System.out.println("O numero "+ n1 + " e o maior, e "+ n2 +" e o menor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			if (n1 > n3) {
				System.out.println("O numero "+ n2 + " e o maior, e "+ n1 +" e o menor.");
			}
			System.out.println("O numero "+ n2 + " e o maior, e "+ n3 +" e o menor.");
		} else if ((n3 > n1) && (n3 > n2)){
			if (n2 > n1) {
				System.out.println("O numero "+ n3 + " e o maior, e "+ n1 +" e o menor.");
			}
			System.out.println("O numero "+ n3 + " e o maior, e "+ n2 +" e o menor.");
		}
	}
}
