package operadoresrelacionais;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Similaridade:
		 * - Igualdade: determina se um operando é igual ao outro
		 * - Diferença: determina se um operando não é igual ao outro
		 * 
		 * Tamanho:
		 * - Maior: determina se um operando é maior do que outro
		 * - Maior Igual: determina se um operando é maior ou igual a outro
		 * - Menor: determina se um operando é menor do que outro
		 * - Menor igual: determina se um operando é menor ou igual a outro
		 * 
		*/	
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;
		float f2 = 3.5f;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fulano";
		String s2 = "Fluano";
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);
		System.out.println(i1 > i2);
		System.out.println(i1 <= i2);
		
		System.out.println(f1 == f2);
		System.out.println(f1 != f2);
		System.out.println(f1 >= f2);
		System.out.println(f1 < f2);
		
		System.out.println(c1 == c2);
		System.out.println(c1 != c2);
		System.out.println(c1 > c2);
		System.out.println(c1 <= c2);
		
		System.out.println(s1 == s2);
		System.out.println(s1 != s2);
		//System.out.println(s1 >= s2);
		//System.out.println(s1 < s2);
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b2);
		//System.out.println(b1 > b2);
		//System.out.println(b1 < i1);
		
		System.out.println(i2 > f1);
	}

}
