package sec01;

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println(MyMath.max(1.23, 3.45)); // MyMath.max() : 클래스 메소드 호
		System.out.println(MyMath.max(5.42, 3.21));
	}

	class MyMath {
		//클래스 메소드 선언 
		static double max(double a, double b) {
			return (a>b)? a: b;
		}
		
		static double min(double a, double b) {
			return (a<b)? a:b;
		}
	}
	
}
