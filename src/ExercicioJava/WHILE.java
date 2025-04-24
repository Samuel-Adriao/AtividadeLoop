package ExercicioJava;
import java.util.Scanner;


public class WHILE {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		int numero = 1;
		int soma = 0;
		int numeroPositivo = 0;
			
		System.out.println("Exercícios com o loop WHILE");
		System.out.println("");
		
		System.out.println("Exercício 1: Impressão de Números de 1 a 50");
		System.out.println("");
		
		while(numero <= 50) {
			System.out.println(numero);
			numero++;
		}
		
		System.out.println("------------------------------------");
		System.out.println("Exercício 2: Soma de Números Positivos");
		System.out.println("");
		
		System.out.print("Por favor, informe números a serem somados: ");
		
		while(true) {
			System.out.print("Por favor, informe mais números a serem somados: ");
			numeroPositivo = dados.nextInt();
	
		if(numeroPositivo < 0) {
			 break;
		}
		
		soma += numeroPositivo;
		}
		
		System.out.println("A soma de todos os números informados é de: " + soma);
		
		System.out.println("------------------------------------");
		System.out.println("Exercício 3: Validação de Senha");
		System.out.println("");
		
		System.out.print("Por favor, informe a senha: ");
		int senha = dados.nextInt();
		
		while(senha != 1234) {
			System.out.print("Senha incorreta, tente novamente: ");
			senha = dados.nextInt();
		}
		
		if(senha == 1234 ) {
			System.out.println("Acesso concedido!");
		}
		
		System.out.println("------------------------------------");
		System.out.println("Exercício 4: Sequência de Fibonacci");
		System.out.println("");
		
		int primeiroNumero = 0;
		int segundoNumero = 1;
		int contagem = 2;
		
		System.out.println(primeiroNumero);
		System.out.println(segundoNumero);
		
		while(contagem < 10) {
			int numeroSeguinte = primeiroNumero + segundoNumero;
			System.out.println(numeroSeguinte);
			primeiroNumero = segundoNumero;
			segundoNumero = numeroSeguinte;
			contagem++;
		}
		
	}

}