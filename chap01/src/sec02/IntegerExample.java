package sec02;

public class IntegerExample {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = 127;
		// byte var3 =128; //바이트의 범위는 -128 ~ 127 
		
		long var4 = 10;
		long var5 = 20L;
		long var6 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		float var7 = 3.14f;
		double var8 = 3.14;
		
		float var9 = 0.123456789123456789f;
		double var10 = 0.123456789123456789;
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);
		
		char c1 ='A';
		char c2 = 65;
		char c3 = '\u0041';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(cham + "가 아니면" + geojit + "입니다.");
				
	}
}
