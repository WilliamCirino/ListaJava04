package lista4;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor.");
		int valor = sc.nextInt();

		if (valor > -1) {
			System.out.println("O valor digitado � Positivo.");
		} else {
			System.out.println("O valor digitado � Negativo.");
		}
		sc.close();
	}

}
