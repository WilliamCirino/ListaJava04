package lista4;

import java.util.Scanner;

public class MaiorOuMenor {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um valor.(Inteiro)");
	int valor1 = sc.nextInt();
	
	if (valor1>10) {
		System.out.println("É MAIOR QUE 10!");
	} else {
		System.out.println("NÃO É MAIOR QUE 10!");
	}
sc.close();
	}

}
