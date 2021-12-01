package operadoresaritmeticos;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * int i = ++k; > i = k + 1
		 * int j = k--; > j = k > k = k -1
		 * 
		 * 
		*/	
		float f = 1.5f + 4.5f;
		
		long l = 10398L * 5L;
		
		double d = 45d / 4d;
		
		int k = 15 % 4;
		
		double d2 = f;
		
		l *= 3;
		
		k %= 2;
		
		/*
		 * Precedência
		 * 1º Pós-fixado | i++, i--
		 * 2º Préfixado  | ++i, --i
		 * 3º Multiplicação | * , / , %
		 * 4º Aditivo 		| +, -
		 * 5º Atributivo | =, +=, -=, *=, /=, %=
		*/
		
		prePos();
		aritmetico();
		atribuicao();
		precedencia();
	}
	
	private static void prePos() {
		int k = 10;
		int i = ++k;
		int j = k--;
		int x = k;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
	}
	
	private static void aritmetico() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a + b;
		int r2 = c - a;
		int r3 = d * b;
		int r4 = e / a;
		int r5 = c % b;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
	
	private static void atribuicao() {
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5f;
		double d = f;
		
		System.out.println(d);
		
		i += 5;
		j -= 3;
		d /= 2.7d;
		l *= 3;
		k %= 2;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(d);
		System.out.println(l);
		System.out.println(k);
		
		i = k = j;
		
		System.out.println(k);
		System.out.println(i);
	}
	
	private static void precedencia() {
		
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k;
		System.out.println(a);
		System.out.println(i);
		
		int b = k / --i % 3 + 1;
		
		System.out.println(b);
		System.out.println(i);
		
		int c = 2;
		
		c *= i +=5;
		
		System.out.println(c);
		
	}
}
