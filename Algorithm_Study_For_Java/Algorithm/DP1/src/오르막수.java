import java.util.Scanner;

public class 오르막수 {

	private static Scanner scanner;
	private static int[][] d;
	private static final int mod = 10007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n + 1][10];

		for (int i = 0; i <= 9; i++) {
			d[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9 - j; k++) {
					d[i][j] += d[i - 1][j + k];
					d[i][j] %= mod;
				}
			}
		}

		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += d[n][i];
		}

		ans %= mod;

		System.out.println(ans);
	}

}
