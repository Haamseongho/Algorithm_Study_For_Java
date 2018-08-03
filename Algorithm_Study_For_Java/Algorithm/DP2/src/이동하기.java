import java.util.Scanner;

public class 이동하기 {

	private static Scanner scanner;
	private static int[][] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		d = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				d[i][j] = scanner.nextInt();
			}
		}

		d[0][0] = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				d[i][j] += Math.max(d[i - 1][j], Math.max(d[i][j - 1], d[i - 1][j - 1]));
			}
		}

		 System.out.println(d[N][M]);
	}

}
