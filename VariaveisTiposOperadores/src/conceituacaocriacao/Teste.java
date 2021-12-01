package conceituacaocriacao;

public class Teste {

	public static void main(String[] args) {
		
		int i;
		
		int I; //Java é case-sensitive I maiúsculo é diferente do minúsculo
		
     //	int 1a; Variável não pode começar com número, compilador não permite. 
		
		int _1a; //Compilador permite porém,Não é recomendável iniciar variável com _
		
		int $aq; //Compilador permite porém,Não é recomendável iniciar variável com $
		
		final int j = 10; // Valor constante
		
		int asrn24678md = 100;
	
		//int asrn246 78md; Variável não pode conter espaços em branco
		
		int asrn24678_md = 10;
	
		//	int asrn2$46%78_md = 10; Não é permitido colocar caracteres especiais nas variáveis como o %
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		System.out.println(j);
		System.out.println(asrn24678_md);
		System.out.println(asrn24678md);
		
		/** Boas práticas de nomear variáveis*/
		
		int quantidadeProduto = 50;
		final int NUMERO_TENTATIVAS = 5;
		int qtdProd = 1;
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(qtdProd);
	}

}
