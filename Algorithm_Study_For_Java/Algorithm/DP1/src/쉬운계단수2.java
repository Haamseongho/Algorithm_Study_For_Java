import java.util.Scanner;

public class 쉬운계단수2 {

	private static Scanner scanner;
	private static int[][] d;
	private static final long mod = 1000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		d = new int[N + 1][10];
		for (int i = 1; i <= 9; i++) {
			d[1][i] = 1; // 한 개
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j - 1 >= 0) {
					d[i][j] += d[i - 1][j - 1];
				}
				if (j + 1 <= 9) {
					d[i][j] += d[i - 1][j + 1];
				}

				d[i][j] %= mod;
			}
		}

		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += d[N][i];
		}

		ans %= mod;

		System.out.println(ans);
	}

}
