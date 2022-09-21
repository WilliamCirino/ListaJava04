/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até 
 * R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 */

package lista4;

import java.util.Scanner;

public class SalarioFixoMaisVendas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor total de seu salário fixo.");
		float salarioFixo = sc.nextFloat();

		System.out.println("Digite o valor da primeira venda.");
		float venda1 = sc.nextFloat();

		System.out.println("Digite o valor da segunda venda.");
		float venda2 = sc.nextFloat();

		System.out.println("Digite o valor da terceira venda.");
		float venda3 = sc.nextFloat();

		if (venda1 < 1.500f) {
			float comissao = salarioFixo / 100 * 3;
		} else if (venda1 > 1.500f) {
			float comissao = salarioFixo / 100 * 5;
		} else if (venda2 < 1.500f) {
			float comissao = salarioFixo / 100 * 3;
		} else if (venda2 > 1.500f) {
			float comissao = salarioFixo / 100 * 5;
		} else if (venda3 < 1.500f) {
			float comissao = salarioFixo / 100 * 3;
		} else {
			float comissao = salarioFixo / 100 * 5;
		}
		sc.close();
	}
}
