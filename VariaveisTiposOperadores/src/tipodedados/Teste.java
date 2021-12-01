package tipodedados;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Diferença entre linguagem compilada x interpretada:
			
			Linguagem compilada é quando seus códigos fontes são transformados diretamente em linguagem de máquina;
			
			Linguagem interpretada é quando os códigos fontes são transformados em uma linguagem intermediária,
			que será executada pela máquina virtual da linguagem quando o programa é executado
		 */
		
		//byte: -128 até 127
		byte b = 127;
		
		//short: -32768 até 32767
		short s = -12785;
		
		//int: -2.147.483.648 até 2.147.483.647
		int i = 8515785;
		
		//long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
		long l = 5838515785L;
		
		//float +-3.402.823.47E+38F
		float f = 3.14f;
		
		//double +-1.79769313486231570+308
		double d = 3.14d;
		
		//char caractere de 16 bits
		char c = '\u0084';
		
		//String: tipo especial
		String ss = "T";
		
		//boolean: verdadeiro ou falso. Valor default é false
		boolean ff = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(ss);
		System.out.println(ff);
		
		
		
	}

}
