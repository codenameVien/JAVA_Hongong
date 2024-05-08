package sec03;

public class Korean {
	
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 
	/*
	 public Korean() {
	 
		name = "이자바";
		ssn = "12345";
	}
	*/
	public Korean() {
		this("이자바", "12345");
	} //this()로 중복 코드 호출 ( 교재 50p this() )
	
	
	
	//생성자
	/*
	 public Korean(String n, String s) {
	
		name = n; // 굳이 this 안 써도 되는 이유가 내 클래스 안에 있는 걸 아니까?
		ssn = s;
	}
	*/
	 // this 쓰는 경우는 매개변수 이름이 필드이름과 완전히 동일한경우 this.필드로 표현함 
	 public Korean(String name, String ssn) {
		 this.name =  name;
		 this.ssn = ssn;
	 }
}
