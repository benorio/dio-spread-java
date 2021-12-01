package controledefluxo;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---Informe o número do mês---");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

//		1º Questão		

		if (i == 1) {
			System.out.println("Janeiro");
		} else if (i == 2) {
			System.out.println("Fevereiro");
		} else if (i == 3) {
			System.out.println("Março");
		} else if (i == 4) {
			System.out.println("Abril");
		} else if (i == 5) {
			System.out.println("Maio");
		} else if (i == 6) {
			System.out.println("Junho");
		} else if (i == 7) {
			System.out.println("Julho");
		} else if (i == 8) {
			System.out.println("Agosto");
		} else if (i == 9) {
			System.out.println("Setembro");
		} else if (i == 10) {
			System.out.println("Outubro");
		} else if (i == 11) {
			System.out.println("Novembro");
		} else if (i == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Opção inválida");
		}
		
		sc.close();
	}

}
