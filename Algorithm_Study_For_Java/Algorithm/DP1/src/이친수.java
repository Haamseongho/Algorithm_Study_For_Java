import java.util.Scanner;

public class ��ģ�� {
	private static Scanner scanner;
	private static long[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new long[n + 1];
		// �ڸ��� , 0 or 1
		d[1] = 1;
		if (n >= 2) {
			d[2] = 1; // �ڸ����� 2 �̻��� ��� ��, �� �ڸ� �̻��� ���ڰ� ���´ٴ� ���ε�,
			// �� �ڸ����� ���� ��ģ���� �ϳ� �Դϴ�.
		}

		for (int i = 3; i <= n; i++)
			d[i] = d[i - 1] + d[i - 2];

		System.out.println(d[n]);
	}
}
