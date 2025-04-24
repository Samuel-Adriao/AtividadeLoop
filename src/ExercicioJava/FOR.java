package ExercicioJava;
import java.util.Scanner;

public class FOR {
	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);

		System.out.println("Exercícios com o loop FOR"); 
		System.out.println(""); 
		System.out.println("Exercício 1: Tabela de Multiplicação do Número 5"); 
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			int resultadoMultiplicacao = 5 * i;
			System.out.println("5 x " + i + " = " + resultadoMultiplicacao);
		}

		System.out.println("------------------------------------");
		System.out.println(""); 
		System.out.println("Exercício 2: Cálculo de Fatorial"); 
		System.out.println("");
		
		System.out.print("Informe um número para calcular o fatorial: ");
		int fatorial = entrada.nextInt();
		
		for(int i = fatorial - 1; i >= 1; i-- ) {
			int calcFatorial = fatorial * i;
			System.out.println(fatorial + " x " + i + " = " + calcFatorial);
		}
		
		System.out.println("------------------------------------");
		System.out.println(""); 
		System.out.println("Exercício 3: Soma de Elementos em um Vetor"); 
		System.out.println("");
		
		int[] numeros = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("O resultado da soma dos vetores é: " + soma);
		
        System.out.println("------------------------------------");
		System.out.println(""); 
		System.out.println("Exercício 4: Impressão de Números Ímpares"); 
		System.out.println("");
		
		for(int i = 1; i <= 100; i = i +2) {
			System.out.println(i);
		}
		
		
		}
}
