package program;

/*
beecrowd | 1154 - Idades

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int i = 0;
		double soma = 0;
		
		while((n = sc.nextInt()) >= 0) {
			soma += n;
			i++;
		}
		
		System.out.printf("%.2f\n", soma / i);
		sc.close();
	}
}
