package algorithm;

public class Frog_jump {

	public static void main(String[] args) {
		int Xposition = 10;
		int Yposition = 85;
		int distance = 30;
		int answer = solution(Xposition, Yposition, distance);
		
		System.out.println(answer);
	}

	public static int solution(int X, int Y, int D) {
		int result = 0;
		result = (Y-X);
		if(result % D == 0)
			return (result / D);
		else
			return (result / D) + 1;
	
	}
}
