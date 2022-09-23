package lista4;

import java.util.Scanner;

public class QuantidadeEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade atual do estoque.");
		float quantidadeAtual = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima do estoque.");
		float quantidadeMax = sc.nextInt();
		
		System.out.println("Digite a quantidade minima do estoque.");
		float quantidadeMin = sc.nextInt();
		
		float quantidadeMedia = (quantidadeMax+quantidadeMin)/2;
		
		if (quantidadeAtual>=quantidadeMedia) {
			System.out.println("Não é necessário efetuar uma nova Compra. " + quantidadeAtual + " itens em estoque.");
		} else {
			System.out.println("Efetue a Compra. "+ quantidadeAtual + " itens em estoque.");
		}
		sc.close();
	}

}
