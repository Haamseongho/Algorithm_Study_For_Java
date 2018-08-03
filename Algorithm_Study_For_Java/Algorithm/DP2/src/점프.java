import java.util.Scanner;

public class มกวม {

	private static Scanner scanner;
	private static long[][] d;
	private static int[][] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		d = new long[100][100];
		a = new int[100][100];

		d[0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (a[i][j] == 0)
					continue;

				if ((j + a[i][j] < N)) {
					d[i][j + a[i][j]] += d[i][j];
				}
				if ((i + a[i][j] < N)) {
					d[i + a[i][j]][j] += d[i][j];
				}
			}
		}
		System.out.println(d[N - 1][N - 1]);
	}
}
