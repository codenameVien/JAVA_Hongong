package sec011ClassExtends;

public class ColorPointExample {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // Point 클래스에서 상속된 필드와 메소드 
		cp.setColor("Red"); //상속된 필드와 메소드 
		cp.showColorPoint();
	}
}
