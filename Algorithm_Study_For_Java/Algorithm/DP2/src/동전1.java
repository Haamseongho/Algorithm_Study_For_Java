import java.util.Scanner;

public class 동전1 {

	private static Scanner scanner;
	private static int[] d; // 경우의 수
	private static int[] a; // 금액의 가치

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		d = new int[k + 1];
		a = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt();
		}

		d[0] = 1;
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= k; i++) {
				if (i - a[j] >= 0)
					d[i] += d[i - a[j]];
			}
		}

		System.out.println(d[k]);
	}

}
