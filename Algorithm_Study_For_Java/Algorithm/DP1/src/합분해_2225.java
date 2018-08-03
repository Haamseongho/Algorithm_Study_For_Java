import java.util.Scanner;

public class 합분해_2225 {

	private static Scanner scanner;
	private static long d[][];
	private static final long mod = 1000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt(); // 정수 s개를 더해서 n을 만들 숫자.
		d = new long[k + 1][n + 1];

		d[0][0] = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j <= n; j++) { // 0부터 n까지의 정수로 만들 수 있는 합의 값 --> 0부터 n까지 가능하기에 0부터 n으로 설정
				// 예를 들어, 0이면 (0+0+0+0+ ... ) -->k개만큼 
				// n이면, (0+n,1+(n-1),.....,(n+0)); --> k개 만큼 돈다.
				for (int l = 0; l <= j; l++) {
					d[i][j] += d[i - 1][j - l];
					d[i][j] %= mod;
				}
			}
		}
		System.out.println(d[k][n]);
	}
}
