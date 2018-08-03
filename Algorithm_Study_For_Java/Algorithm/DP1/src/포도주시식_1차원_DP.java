import java.util.Scanner;

public class �����ֽý�_1����_DP {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		a = new int[n + 1];
		d = new int[n + 1];
		/*
		 * 0�� ���� --> d[i] = d[i-1] 1�� ���� --> d[i] = a[i] + d[i-1]; 2�� ���� --> d[i] = a[i]
		 * + a[i-1] + d[i-2];
		 */

		// n�� 10000 ���� , �������� ���� 1000���� �̱� ������ ����� int�� �ص� �ȴ�.
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt(); // �������� ��
		}

		d[1] = a[1];
		d[2] = a[1] + a[2];

		long ans = 0;
		for (int i = 3; i <= n; i++) {
			// �ٷ� üũ
			// 0�� ����
			d[i] = d[i - 1];
			if (d[i] < d[i - 2] + a[i]) {
				// 1�� ���� --> i��° ������ ���ð� i-1��° ������ ���� i-2��°�� ���ŵ� �ǰ� �ȸ��ŵ� �ǰ�
				d[i] = d[i - 2] + a[i];
			}

			// 2�� ����
			if (d[i] < d[i - 3] + a[i] + a[i - 1]) {
				// i ��° ������ ���ð� i-1 ���� ������ ���ð� i-2 ��° �����ִ� ���ø� ���� �ȵǰ� i-3��° �����ִ� ���ŵ� �ǰ� �ȸ��ŵ� �ǰ�.
				d[i] = d[i - 3] + a[i] + a[i - 1];
			}

		}
		ans = d[n];
		System.out.println(ans);
	}

}
