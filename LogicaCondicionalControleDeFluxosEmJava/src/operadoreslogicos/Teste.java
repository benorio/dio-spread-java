package operadoreslogicos;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Conjunção: operação lógica que só é verdadeira quando ambos os operandos ou expressões 
		 * envolvidas são verdade. (&&)
		 * 
		 * Disjunção: Operação que só é falsa quando ambos os operandos ou expressões envolvidas
		 * são falsos. (||)
		 * 
		 * Disjunção exclusiva: Operação que só é verdade quando ambos os operandos ou expressões
		 * são opostos (^)
		 * 
		 * Negação: Operação que inverte o valor lógico de um operando ou expressão. (!)
		 * 
		 * Bitwise: & e | não é operador lógico
		 * shift: ~,>>,>>>,<<
		*/	
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b2 || b3);
		System.out.println(b2 || b4);
		System.out.println(b1 ^ b3);
		System.out.println(b4 ^ b1);
		System.out.println(!b1);
		System.out.println(!b2);
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		System.out.println((i1 > i2) || (f2 < f1));
		System.out.println((i1 + i2) < (f2-f1) && true);
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		System.out.println((salarioBaixo) && (muitosDependentes));
		
		boolean recebeAuxilio = ((salarioBaixo) && (muitosDependentes));
		System.out.println(recebeAuxilio);
		
		
		
		
		
		
		
	}

}
