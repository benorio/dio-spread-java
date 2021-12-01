package controledefluxo;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 5");
		
		int i = sc.nextInt();
		
		switch (i) {
		case 1:		
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado!");
			break;
		case 5:
			System.out.println("Talvez!");
			break;
		default:
			System.out.println("Valor indefinido");
			break;
		}
		sc.close();
	}

}
