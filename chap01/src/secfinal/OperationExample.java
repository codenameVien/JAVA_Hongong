package secfinal;

public class OperationExample {
	public static void main(String[] args) {
		
		byte result1 = 10+20;
		System.out.println(result1);  //자동형변
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int result2 = byteValue1 + byteValue2; //자동형변
		System.out.println(result2);
		
		int intValue1 = 10;
		int intValue2 = intValue1/4; // 정수값으로 결과 나옴 
		System.out.println(intValue2); 
		
		int intValue3 =10;
		double doubleValue = intValue3 /4.0; // double형으로 형변환 
		System.out.println(doubleValue);
		
		
		
		int intValue4 =1;
		int intValue5 =2;
		double  result3 = (double)intValue4 / intValue5; //형변환 
		System.out.println(result3);
		
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 =4;
		// short result4 = s1 + s2; //int형을 short형에 집어넣을 수 없기에 오
		int result5 = s1 + s2;
		int result6 = i1 + i2;
		System.out.println(result5);
		System.out.println(result6);
		
		
	}
}
