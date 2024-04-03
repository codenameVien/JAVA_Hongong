package sec02;

public class String2Example {
	
	public static void main(String[] args) {
		
		String str1 = "Hi, Java!";
		String str2 = new String("Hi, Java!");
		String str3 = new String("Hi, java!");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));

		int len;
		len = str1.length();
		System.out.println("문자열 길이(str1): "+len);
	    System.out.println("문자열 길이(str2): "+ str2.length());

	    //String str4 =null;
	    //System.out.println("문자열 길이(str4): "+ str4.length()); //s4가 null이기 때문에 에
	    //str3 =str4;
	    //System.out.println("문자열 길이(str3): " + str3.length()); //s3 null이기 때문에 에
	}
}
