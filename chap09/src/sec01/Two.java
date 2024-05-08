package sec01;

public class Two {
// Two클래스는 상속되지 않았기 때문에 
// 저 필드를 사용하려면 
// 처음부터 static 필드이거나
// 객체를 생성하여 필드에 접근하여야 한다 
	// 아래에서는 객체 생성방법으로 접근 
	
	void print() {
		One o = new One();
		//System.out.println(o.secret);
		  // private인데 다른 클래스 이므로 private사용 불가 
		System.out.println(o.roommate);
		System.out.println(o.child);
		System.out.println(o.anybody);
	}
}
