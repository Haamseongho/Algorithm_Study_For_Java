import java.util.Scanner;

public class 파일합치기2 {

	private static Scanner scanner;
	private static int t; // test case
	private static int[][] d;
	private static int[] a;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // test case

		while (t-- > 0) {
			n = scanner.nextInt(); // 갯수
			a = new int[n + 1];
			d = new int[n + 1][n + 1];

			for (int i = 1; i <= n; i++)
				a[i] = scanner.nextInt();

			System.out.println(go(a, d, 1, n));
		}
	}

	private static int go(int[] a, int[][] d, int i, int j) {
		if (i == j)
			return 0;
		if (d[i][j] > 0)
			return d[i][j];

		//d[i][j] = 0;
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += a[k];
		}

		int ans = -1;
		for (int k = i; k <= j - 1; k++) {
			int temp = go(a,d,i,k) + go(a,d,k+1,j) + sum;
			if (temp < ans || ans == -1) {
				ans = temp;
			}
		}
		d[i][j] = ans;
		return d[i][j];
	}
}
