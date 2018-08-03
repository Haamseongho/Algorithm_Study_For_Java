import java.util.Scanner;

public class 파일합치기 {

	private static Scanner scanner;
	private static int t; // test case
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			a = new int[n + 1];
			d = new int[n + 1][n + 1];
			for (int i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
			}
			/*for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					d[i][j] = -1;
				}
			}*/
			System.out.println(go(1, n));
		}
	}

	private static int go(int i, int j) {
		if (i == j)
			return 0;
		if (d[i][j] > 0)
			return d[i][j];

		int sum = 0;
		int ans = -1;
		d[i][j] = 0;
		for (int k = i; k <= j; k++)
			sum += a[k];

		for (int k = i; k <= j - 1; k++) {
			int temp = go(i, k) + go(k + 1, j) + sum;
			if (temp < ans || ans == -1) {
				ans = temp;
			}
		}

		d[i][j] = ans;
		return ans;
	}
}
