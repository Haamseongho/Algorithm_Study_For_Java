import java.util.Scanner;

public class �Ӹ����_1 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // �Է� ����
		a = new int[N + 1];
		d = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = scanner.nextInt();
		}

		int t = scanner.nextInt(); // test case
		while (t-- > 0) {
			int s = scanner.nextInt();
			int e = scanner.nextInt();

			System.out.println(go(s, e));
		}
	}

	private static int go(int i, int j) {
		if (i == j) {
			// �������� ������ ���� ��� ==> ���̰� 1�� ���
			return 1;
		} else if (i + 1 == j) {
			// �������� ������ �ϳ� ���� ���� ��� (���̰� 2)
			if (a[i] == a[j]) {
				return 1;
			} else {
				return 0;
			}
		} else {
			// ���� 3�̻�
			// memorization ����
			if (d[i][j] > 0) {
				return d[i][j];
			}
			if (a[i] != a[j]) {
				// �Ӹ������ �ƴ� ���
				return d[i][j] = 0; // 0���� ���
			} else {
				// �Ӹ������ ���
				return d[i][j] = go(i + 1, j - 1);
				// ������ �Ӹ�������� üũ�ϱ�
				// --> ������ �Ӹ������ ��� return 1�� �ǹǷ�
			}
		}
	}
}
