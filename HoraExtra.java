package lista4;

import java.util.Scanner;

/* 9) A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora
extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero de horas trabalhadas 
em um m�s, o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham 
sido trabalhadas (considere que o m�s possua 4 semanas exatas).*/

public class HoraExtra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero de horas trabalhadas durante o m�s.");
		float horasMes = sc.nextFloat();

		System.out.println("Digite o valor de seu sal�rio por hora.");
		float salarioHora = sc.nextFloat();

		float salario = horasMes * salarioHora, horaExtra = horasMes - 160;

		if (horasMes > 160) {
			horaExtra = (horasMes - 160) * (50 * salarioHora / 100 + salarioHora);
			System.out.println("O seu sal�rio mensal � R$" + horaExtra + salario);
		} else {
			System.out.println("O seu sal�rio mensal � R$" + salario);
			sc.close();
		}

	}

}
