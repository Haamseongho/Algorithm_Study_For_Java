import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 내리막길2 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[][] a;
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int M, N;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		M = scanner.nextInt(); // 행
		N = scanner.nextInt(); // 열

		d = new int[M][N];
		a = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = scanner.nextInt();
				d[i][j] = -1;
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
