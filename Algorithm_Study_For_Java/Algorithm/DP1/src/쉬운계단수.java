import java.util.Scanner;

public class 쉬운계단수 {

	private static Scanner scanner;
	private static final int mod = 1000000000;
	private static int[][] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		d = new int[N+1][10];
		// 첫 번째 인자 --> N 개 들어갈 수 있음
		// 두 번째 인자 --> 9 개 들어갈 수 있음

		for (int i = 1; i <= 9; i++)
			d[1][i] = 1; // 첫 번째 줄에 모든 값은 순서대로 들어간다 그래서 9개 : 갯수 1 

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				d[i][j] = 0; // 0 초기화
				if (j - 1 >= 0)
					d[i][j] += d[i - 1][j - 1];
				if (j + 1 <= 9)
					d[i][j] += d[i - 1][j + 1];

				d[i][j] %= mod;
			}
		}
		
		long ans = 0;
		for(int i=0;i<=9;i++) 
			ans += d[N][i];
		
		ans %= mod;
		
		System.out.println(ans);
	}
}
