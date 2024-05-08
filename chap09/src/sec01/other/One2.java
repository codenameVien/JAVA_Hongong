package sec01.other;

import sec01.One;
//외부에 있는 클래스 쓰니까 임포트..
//패키지 위치가 다르므로 (이거 하위패키지에서 사용못한다고 저번 시간에 본듯)  
// One 의 정보를 상속 또는 사용하려면
// import 를 해야함 (import를 쓰려면 class명(여기서는 One)까지 써야함)


public class One2 extends One {
// One클래스를 상속함

	void print() {
		///System.out.println(secret);
		//System.out.println(roommate);
		System.out.println(child); //다른 패키지의 자식 클래스니 사용가능 
		System.out.println(anybody);
	}
}
