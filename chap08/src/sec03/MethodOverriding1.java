package sec03;


class Animal {
	void cry() {
		System.out.println("___");
	}
}


class Bird extends Animal{
	
	void cry() {
		System.out.println("chirp-chirp"); //메서드 오버라이딩(재정의)  
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("meow"); //메서드 오버라이딩 
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		
		Animal aa = new Animal();
		aa.cry(); // ____
		
		
		Bird bb = new Bird();
		bb.cry(); // chirp-chirp

		Cat cc = new Cat();
		cc.cry(); // meow 
		
		
		
		Animal ab = new Bird(); //업캐스팅 (자동형변환)
		ab.cry(); // chirp-chirp 
		          // (객체는 Animal 타입이지만 본래 객체인 Bird에서 재정의한 메서드가 호출됨) 
		
		Animal ac = new Cat(); //업캐스팅
		ac.cry(); // meow 
		          // (객체는 Animal 타입이지만 본래 객체인 Bird에서 재정의한 메서드가 호출됨) 
		
		//->메서드 오버라이딩 으로 다형적 표현 가능!! 
		
	}

}
