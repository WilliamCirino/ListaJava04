package lista4;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira avalia��o.");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a nota da segunda avalia��o.");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;

		if (media > 5.99f) {
			System.out.println("Aluno Aprovado." + media);
		} else {
			System.out.println("Aluno Reprovado." + media);
		}
		sc.close();
	}

}
