import java.util.Scanner;
public class �����ֽý� {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // ������ ���� ���� n��
		// 1���� n+1��°���� ������ �� üũ
		a = new int[n + 1];

		// n�� 10000 ���� , �������� ���� 1000���� �̱� ������ ����� int�� �ص� �ȴ�.
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt(); // �������� ��
		}

		d = new int[n + 1][3]; // 0�� ���� , 1�� ���� , 2������

		for (int i = 1; i <= n; i++) {
			d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2])); // ���� x
			d[i][1] = d[i - 1][0] + a[i];
			d[i][2] = d[i - 1][1] + a[i];
		}

		long ans = 0;
		ans += Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
		System.out.println(ans);
	}

}
