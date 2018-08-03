import java.util.Scanner;

public class ����1_2 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // ������ ����
		int k = scanner.nextInt(); // �հ� �޾�

		d = new int[k + 1][k + 1];
		a = new int[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();

		d[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				d[i][j] = d[i - 1][j]; // a[i] �ݾ� �� �� ���
				if (j - a[i] >= 0) {
					d[i][j] += d[i][j - a[i]]; // a[i] �ݾ��� ����� ���
				}
			}
		}

		System.out.println(d[n][k]);
	}

}
