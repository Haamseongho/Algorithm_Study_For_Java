import java.util.Scanner;

public class 팰린드롬_분할 {

	private static Scanner scanner;
	private static boolean[][] b;

	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		s = " " + s;

		int n = s.length();
		System.out.println(n);
		b = new boolean[n + 1][n + 1];
		d = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			b[i][i] = true;
		}

		for (int i = 1; i <= n - 1; i++) {
			System.out.println(i + 1);
			if (s.charAt(i) == s.charAt(i + 1)) {
				b[i][i + 1] = true;
			}
		}

		for (int k = 2; k < n; k++) {
			for (int i = 1; i <= n - k; i++) {
				int j = i + k;
				if (s.charAt(i) == s.charAt(j) && b[i + 1][j - 1]) {
					b[i][j] = true;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			d[i] = -1;
			for (int j = 1; j <= i; j++) {
				if (b[i][j]) {
					if (d[i] == -1)
						d[i] = Math.min(d[i], d[j - 1]) + 1;
				}
			}
		}
		System.out.println(d[n]);
	}

}
