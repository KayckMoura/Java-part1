package Fundamentos;
import java.util.Scanner;

public class Aula024 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce telefonou pra vitima: "
        		+ "Esteve no local do crime: "
        		+ "Mora perto da vitima:  "
        		+ "Devia para a vitima: "
        		+ "Ja trabalhou com a vitima: ");
        
        double resp1 = scanner.nextDouble();
        double resp2 = scanner.nextDouble();
        double resp3 = scanner.nextDouble();
        double resp4 = scanner.nextDouble();
        double resp5 = scanner.nextDouble();

        if (resp1 = "Sim"); {
        
        System.out.println("Voce é Inocente");
        
        } else if (resp2 = "Sim"); {
        
        System.out.println("Voce é Suspeita"); 
        
        } else if (resp3 = "Sim"); {
        
        System.out.println("Voce é Inocente");
        
        } else if (resp4 = "Sim"); {
        
        System.out.println("Voce é Suspeita");
        
        } else (resp5 = "Sim");
        
        System.out.println("Voce é Suspeita");

    }
}