import java.util.Scanner;

public class 동전1_2 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 동전의 갯수
		int k = scanner.nextInt(); // 합계 급액

		d = new int[k + 1][k + 1];
		a = new int[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();

		d[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				d[i][j] = d[i - 1][j]; // a[i] 금액 안 쓴 경우
				if (j - a[i] >= 0) {
					d[i][j] += d[i][j - a[i]]; // a[i] 금액을 사용한 경우
				}
			}
		}

		System.out.println(d[n][k]);
	}

}
