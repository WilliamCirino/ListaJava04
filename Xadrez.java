package lista4;

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora do inicio da partida.");
		float inicioPartida = sc.nextFloat();
		
		System.out.println("Digite a hora do final da partida.");
		float finalPartida = sc.nextFloat();
		
		float duracao = finalPartida-inicioPartida;
		
		if (duracao<0) {
			duracao=duracao+24;
			System.out.println("O tempo total de dura��o da partida � de: "+duracao);
		} else {
			System.out.println("O tempo total de dura��o da partida � de: "+duracao);
		}
sc.close();
	}

}
