package sec03;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) // 즉 scores 배열을 싹 훑어본다는 
		{
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균 : " + avg);
	}
}
