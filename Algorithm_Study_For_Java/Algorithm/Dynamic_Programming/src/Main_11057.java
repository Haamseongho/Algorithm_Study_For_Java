import java.util.Scanner;

public class Main_11057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // nÀÚ¸´¼ö
		int d[][] = new int[n + 1][10];
		long mod = 10007;
		for (int i = 0; i <= 9; i++) {
			d[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					d[i][j] += d[i - 1][k];
					d[i][j] %= mod;
				}
			}
		}
		long ans = 0;
		for (int k = 0; k <= 9; k++) {
			ans += d[n][k];
		}

		ans %= mod;
		System.out.println(ans);
	}

}
