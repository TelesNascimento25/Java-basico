public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Questão_4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[4];

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Digite o número " + (i + 1) + ":");
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.println("Deseja ver os números em ordem crescente (Crescente) ou decrescente (Decrescente)?");
	        String opcao = scanner.next();

	        if (opcao.equalsIgnoreCase("Crescente")) {
	            Arrays.sort(numeros);
	            System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
	        } else if (opcao.equalsIgnoreCase("Decrescente")) {
	            Arrays.sort(numeros);
	            for (int i = numeros.length - 1; i >= 0; i--) {
	                System.out.print(numeros[i] + " ");
	            }
	            System.out.println("\nNúmeros em ordem decrescente.");
	        } else {
	            System.out.println("Opção inválida. Por favor, escolha Crescente para crescente ou Decrescente para decrescente.");
	        }

	        int quantidadePares = 0;
	        int quantidadeImpares = 0;

	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                quantidadePares++;
	            } else {
	                quantidadeImpares++;
	            }
	        }

	        System.out.println("\nQuantidade de números pares: " + quantidadePares);
	        System.out.println("Números pares: ");
	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                System.out.print(numero + " ");
	            }
	        }

	        System.out.println("\n\nQuantidade de números ímpares: " + quantidadeImpares);
	        System.out.println("Números ímpares: ");
	        for (int numero : numeros) {
	            if (numero % 2 != 0) {
	                System.out.print(numero + " ");
	            }
	        }
	    }
	}


