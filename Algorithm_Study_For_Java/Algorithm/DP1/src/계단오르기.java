import java.util.Scanner;


public class ��ܿ����� {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n + 1][3];
		a = new int[n + 1];

		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();
		// ���� üũ
		// d[0] = a[0];
		
		d[1][1] = a[1]; // ó�� ������ --> 1ȸ ���� ���� --> ������ a[1];

		for (int i = 2; i <= n; i++) {
			d[i][2] = d[i - 1][1] + a[i];
			d[i][1] = Math.max(d[i - 2][1], d[i - 2][2]) + a[i];
		}

		// ������ ����� ����� �� �ִ� ���� üũ�ؾ���
		// ������ ����� ����� �� �̰� 2�� ���������ؼ� ���� ������, 1ȸ �������� ���� ������ üũ�ؾ��Ѵ�.

		int ans = Math.max(d[n][1], d[n][2]);
		System.out.println(ans);
	}

}
