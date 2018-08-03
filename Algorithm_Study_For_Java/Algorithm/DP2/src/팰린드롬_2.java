import java.util.Scanner;

public class ÆÓ¸°µå·Ò_2 {

	private static Scanner scanner;
	private static boolean[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// a °¹¼ö

		a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();

		d = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			d[i][i] = true;
		}

		for (int i = 1; i < n; i++) {
			if (a[i] == a[i + 1])
				d[i][i + 1] = true;
		}

		for (int k = 2; k <= n; k++) {
			for (int i = 1; i <= n - k; i++) {
				int j = k + i;
				if (a[i] == a[j] && d[i + 1][j - 1]) {
					d[i][j] = true;
				}
			}
		}

		int t = scanner.nextInt();
		
		// test case
		while (t-- > 0) {
			int s = scanner.nextInt();
			int e = scanner.nextInt();
			if (d[s][e]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
