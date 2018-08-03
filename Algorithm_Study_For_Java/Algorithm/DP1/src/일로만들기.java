import java.util.Scanner;

public class 일로만들기 {

	private static int[] d;
	private static int N;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		N = scanner.nextInt();
		d = new int[N+1];
		
		System.out.println(go(N));
	}

	private static int go(int N) {
		// d[N] 의 점화식을 먼저 생각할 것
		// 종료 조건 체크
		
		
		if (N == 1)
			return 0; // 1로 가는 거리는 1임

		if(d[N] > 0)
			return d[N];
		
		d[N] = go(N - 1) + 1;

		if (N % 2 == 0) {
			int temp = go(N / 2) + 1;
			if (d[N] > temp) {
				d[N] = temp;
			}
		}

		if (N % 3 == 0) {
			int temp = go(N / 3) + 1;
			if (d[N] > temp) {
				d[N] = temp;
			}
		}

		return d[N];
	}
}
