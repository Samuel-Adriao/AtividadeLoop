package ExercicioJava;
import java.util.Scanner;



	public class doWhile { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Exercícios com o loop DO WHILE"); 
		System.out.println(""); 
		System.out.println("Exercício 1: Validação de Entrada de Dados"); 
		System.out.println("");
		int numeroCentena; 
		do{ 			
			System.out.print("Informe um número entre 1 e 100: "); 
			numeroCentena = input.nextInt(); 
		} while(numeroCentena <= 0 || numeroCentena > 100); 
		
		System.out.println("Seu número é: " + numeroCentena); 
		System.out.println("------------------------------------"); 
		System.out.println("Exercício 2: Menu Interativo"); 	
		System.out.println(""); 
		int opcaoMenu;
		
		do { 
			System.out.println("Escolha uma opção:"); 
			System.out.println("1- Adicionar"); 
			System.out.println("2- Remover"); 
			System.out.println("3- Sair"); 
			opcaoMenu = input.nextInt(); 
		}while(opcaoMenu <= 0 || opcaoMenu >3); 
		
		if(opcaoMenu == 1) { 
			System.out.println("Você escolheu 'Adicionar' "); 
		} 
		
		if(opcaoMenu == 2) { 
			System.out.println("Você escolheu 'Remover' ");
			} 
		if(opcaoMenu == 3) { 
			System.out.println("Programa Encerrado!"); 	
	} 
		
		System.out.println("------------------------------------"); 
		System.out.println("Exercício 3: Jogo de Adivinhação"); 
		System.out.println("");
		
		int numeroCerto; 
		int tentativas = 0; 
		
		do { 
			System.out.print("Tente adivinhar o número que estou pensando entre 1 e 20! "); 
			numeroCerto = input.nextInt(); 
			tentativas ++; 
		} while(numeroCerto != 4); 
		
		System.out.println("Parabéns! Você acertou!"); 
		System.out.println("Você errou " + tentativas + " vezes.");
		
		System.out.println("------------------------------------"); 
		System.out.println("Exercício 4: Cálculo de Média de Notas");
		System.out.println(""); 
		
		int contadorAluno = 0;
		int notaAluno; 
		int confirmacao; 
		int somaNota = 0; 
		do { System.out.print("Digite a nota do aluno de 0 a 10: "); 
		notaAluno = input.nextInt(); 
		
		while(notaAluno < 0 || notaAluno > 10) {
			System.out.println("Valor incoerente, por favor fornceça notas entre 0 e 10");
			notaAluno = input.nextInt();
		}
		
		System.out.println("Deseja digitar mais alguma nota? "); 
		System.out.println("1- Sim"); 
		System.out.println("2- Não"); 
		confirmacao = input.nextInt(); 
		somaNota += notaAluno; contadorAluno++;
		}while(confirmacao == 1); 
		
		double mediaNota = 0; 
		if(confirmacao == 2) { mediaNota = somaNota / contadorAluno; 
		System.out.print("A média das notas é: " + mediaNota + " pontos!"); 
		}
		
		
	}	
 }