package sec02;

public class ArrayPassing {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		increase(a); // 현재 클래스 내부의 메소드이므로 그냥 메소드 이름만 적음 
		
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}
