package sec03;


public class KoreanExample {
	public static void main(String[] args) {
		
		//Korean k1 = new Korean(); // Korean객체 주소를 저장하는 k1 변수
		//// 이거 디버깅 해서 보면 k1 에 Korean 저장된 거 볼수 있음 
		
		Korean k0 = new Korean();
		System.out.println("k0.name : " + k0.name);
		System.out.println("k0.ssn : " + k0.ssn);
		
		
		Korean k1 = new Korean("박자바", "012345-1234567");
		//System.out.println(k1.nation + "," + k1.name + "," + k1.ssn);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "123456-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
