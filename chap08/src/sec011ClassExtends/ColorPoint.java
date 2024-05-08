package sec011ClassExtends;

class Point {
	int x,y; //한 점을 구성하는 x,y좌표 필드 
	
	public void set(int x, int y) {
		this.x =x; this.y = y;
	}
	
	public void showPoint() { //점의 좌표 출력 
		System.out.println("("+x+","+y+")");
	}
}


public class ColorPoint extends Point {
	
	String color; //점의 색 필드
	
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() { //컬러 점의 좌표 줄력
		System.out.print(color);
		showPoint();
	}
}
	

