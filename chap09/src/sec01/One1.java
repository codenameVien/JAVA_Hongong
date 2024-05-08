package sec01;

public class One1 extends One {
//상속한 자식 클래스 One1!
//즉 One의 모든 것을 가져왓음
	
	//자식 부모의 private 빼고 전부 사용가능하다
	void print() {
		//System.out.println(secret);  
		System.out.println(roommate);
		System.out.println(child);
		System.out.println(anybody);
	}
}
