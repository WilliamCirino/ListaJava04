package lista4;

import java.util.Scanner;

public class PodeVotarOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento.");
		int anoNascimento = sc.nextInt();
		System.out.println("Digite o atual.");
		int anoAtual = sc.nextInt();

		int resultado = anoAtual - anoNascimento;

		if (resultado < 16) {
			System.out.println("Não Pode Votar! " + resultado +" Anos");
		} else {
			System.out.println("Pode Votar! " + resultado + " Anos");
		}
		sc.close();
	}

}
