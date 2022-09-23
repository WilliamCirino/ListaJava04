package lista4;

import java.util.Scanner;

public class ContaCorrente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu Saldo em conta. ");
		float saldo = sc.nextFloat();

		System.out.println("Digite seu Débito em conta. ");
		float debito = sc.nextFloat();

		System.out.println("Digite seu Crédito. ");
		float credito = sc.nextFloat();

		float saldoAtual = saldo - debito + credito;

		if (saldoAtual > 0) {
			System.out.println("Saldo Positivo - R$" + saldoAtual);
		} else {
			System.out.println("Saldo Negativo - R$" + saldoAtual);

			sc.close();

		}
	}
}
