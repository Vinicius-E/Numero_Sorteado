package application;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random sorteio = new Random();
		
		Integer nSorteado = sorteio.nextInt(50);
		
		int tentativas = 0;
		boolean continua = true;
		do {
			System.out.print("Para descobrir o número sorteado de (0-50). Digite úm número: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			tentativas ++;
			
			if(numero == nSorteado) {
				System.out.println("Parabéns!!! Você encontrou o número sorteado ==>> " + numero + " <<==");
				System.out.println("O número de tentativas necessárias: " + tentativas);
				continua = false;
			}
			else if(numero < nSorteado) {
				System.out.println("Número não sorteado! O Número sorteado é maior que o digitado.");
				System.out.println("Tente Novamente.");
			}
			else {
				System.out.println("Número não sorteado! O Número sorteado é menor que o digitado.");
				System.out.println("Tente Novamente.");	
			}
		}while(continua == true);
		
		System.out.println("__________   FIM   __________");
		
		sc.close();
	}

}
