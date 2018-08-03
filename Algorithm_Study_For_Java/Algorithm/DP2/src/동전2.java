import java.util.Scanner;

public class 동전2 {
	private static Scanner scanner;
	private static int[] d; // 경우의 수
	private static int[] a; // 금액의 가치

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();

		d = new int[k + 1];

		for (int i = 0; i <= k; i++) {
			d[i] = -1;
		}
		d[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				if (j - a[i] >= 0 && d[j - a[i]] != -1) {
					if (d[j] == -1 || d[j] > d[j - a[i]] + 1) {
						d[j] = d[j - a[i]] + 1;
					}
				}
			}
		}

		System.out.println(d[k]);
	}

}
