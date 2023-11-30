package Fundamentos;
import java.util.Scanner;

public class Aula023 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("A media do aluno e: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}