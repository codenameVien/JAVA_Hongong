package sec01.other;

import sec01.One;
//외부에 있는 클래스 쓰니까 임포트.. 

public class Three {
	
	void print() {
		One o = new One();
		//System.out.println(o.secret);
		//System.out.println(o.roomate);
		// System.out.println(o.child);
		System.out.println(o.anybody);
	}
}
