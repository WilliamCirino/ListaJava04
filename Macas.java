package lista4;

import java.util.Scanner;

public class Macas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a quantidade de maças compradas.");
		int macasCompradas = sc.nextInt();
				
		if (macasCompradas>11) {
			int valormacas = macasCompradas*1;
			System.out.println("O custo total da compra é de: "+ valormacas + " reais");
		} else {
			float valormacas = macasCompradas*1.30f;
			System.out.println("O custo total da compra é de: "+ valormacas + " reais");
		}
		sc.close();
		
		
		

	}

}
