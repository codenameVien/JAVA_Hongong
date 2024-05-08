package sec02;

public class ValuePassing {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		increase(n); //n의 값을 m에 복사!
		
		System.out.println(n); // 값이 10이 나오는 이유 : 참조해야지만 값이 변함요!
	}
	
	static void increase(int m) {
		m += 1;
	}
}
