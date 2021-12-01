package conversoes;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Upcast - implícito
		 * Downcast - explícito
		 * 
		 * long l; int i = 10; l = j;
		 * int i; long l = 100; i = (int)l;
		 * double d; float f = 10.5f; d = f;
		 * float f; double d = 10.5d; f = (float)d;
		 * int i; float f = 10.5f; i = (int) f;
		*/	
		
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1;
		
		long l1;
		int i1 = 10;
		l1 = i1;
		
		int i2;
		long l2 = 100000000000000000L;
		i2 = (int)l2;
		
		int i3;
		long l3 = 10000L;
		i3 = (int)l3;
		
		double d1;
		float f1 = 10.5f;
		d1 = (double)f1;
		
		float f2;
		float f3;
		double d2 = 10000.58d;
		f2 = (float)d2;
		double d3 = 10000.0000000000000000000000000000d;
		f3 = (float)d3;
		
		int i4;
		float f4 = 11.56789f;
		i4 = (int)f4;
		
		System.out.println(b1);
		System.out.println(l1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(d1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(i4);
		
		b1 = (byte)d3;

		System.out.println(b1);
	}

}
