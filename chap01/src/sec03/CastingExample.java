package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; //강제 형변
		System.out.println(charValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; //강제 형변
		System.out.println(intValue);
	}
}
