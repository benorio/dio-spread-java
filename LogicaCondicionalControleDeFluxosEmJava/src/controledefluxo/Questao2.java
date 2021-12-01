package controledefluxo;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		2º Questão
//		
//		if (i == 1 || i == 7 || i == 12 ) {
//			System.out.println("Aproveite suas férias");
//		} else {
//			System.out.println("Período laboral");
//		}
		
		System.out.println("Digite o dia da semana");
		
		String diaDaSemana = sc.next();
		
		switch(diaDaSemana) {
		case "Domingo":
			System.out.println(1);
			break;
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça-feira":
			System.out.println(3);
			break;
		case "Quarta-feira":
			System.out.println(4);
			break;
		case "Quinta-feira":
			System.out.println(5);
			break;
		case "Sexta-feira":
			System.out.println(6);
			break;
		case "Sabado":
			System.out.println(7);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		sc.close();
	}

}
