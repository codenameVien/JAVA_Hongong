package sec02;

public class ValuePassing {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		increase(n); // 값이 10이 나오는 이유 : 참조해야지만 값이
		
		System.out.println(n);
	}
	
	static void increase(int m) { //n의 값을 m에 복
		m += 1;
	}
}
