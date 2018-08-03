import java.util.Scanner;

public class �̵��ϱ�2 {
	private static Scanner scanner;
	private static int[][] d;
	private static int n;
	private static int m;
	private static int[][] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();

		d = new int[n + 1][m + 1];
		a = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				a[i][j] = scanner.nextInt();
				d[i][j] = -1;
			}
		}

		System.out.println(go(1, 1));

	}

	private static int go(int x, int y) {
		if (x > n || y > m) {
			return 0;
		}
		// 0 ���� ũ�ų� ������ �� ���
		if (d[x][y] >= 0) {
			return d[x][y];
		}
		d[x][y] = go(x + 1, y) + a[x][y];
		int temp = go(x, y + 1) + a[x][y];
		if (d[x][y] < temp) {
			d[x][y] = temp;
		}

		return d[x][y];
	}
}
