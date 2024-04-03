package sec03;

public class gradescore {
	public static void main(String args[]) {
		
		//방법 1 : 배열 생성 + 값 대입

		float[] g1 = new float[4];
		g1[0] = 3.45f;
		g1[1] = 2.82f;
		g1[2] = 3.82f;
		g1[3] = 3.94f;
		
		System.out.println(g1[0]);
		
		//방법2 : 배열 생성 및 값 대입
		double[] g2 = new double[] {3.45, 2.82, 3.85, 3.94};
		
		//방법3 : 대입할 값만 입력
		double[] g3 = {3.45, 2.82, 3.85, 3.94};
		
	}
}
