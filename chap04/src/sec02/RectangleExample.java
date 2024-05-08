package sec02;

class Rectangle{
	/*
	int width; 
	int height;
	
	int Rec_size(int x, int y) {
		int size = x *y;
		return size;
	}
	
	void solution(){
		int result = Rec_size(3,5);
		System.out.println(result);
	}
	*/
	
	int width;
	int height;
	
	int getArea() {
		return width*height;
	}
	
	
}

//Solution
public class RectangleExample {
	public static void main(String[] args) {
	
		/*
		Rectangle myRec = new Rectangle();
		myRec.solution();
		*/
		
		Rectangle rect = new Rectangle();
		
		rect.width = 3; //객체.필드명
		rect.height = 5;
		
		System.out.println("rect.getArea()");
	
	}
}
