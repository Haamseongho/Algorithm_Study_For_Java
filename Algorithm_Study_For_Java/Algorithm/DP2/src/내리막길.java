import java.util.Scanner;

public class �������� {

	private static Scanner scanner;
	private static int[][] d;
	private static int[][] a;
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int n, m;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();

		a = new int[n][m];
		d = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt();
				d[i][j] = -1;
			}
		}

		// -1 �� �ʱ�ȭ �ؾ� 0���� ũ�ų� ���� ��� memorization ����
		System.out.println(go(a, d, 0, 0)); // ��� �Լ��� 0,0 ���� �����ϴ� ��! ����������~
	}

	private static int go(int[][] a, int[][] d, int x, int y) {
		// ���� ���� --> �������� �������� ���� ���
		if (x == n-1 && y == m-1) {
			return 1;
		}

		if (d[x][y] >= 0)
			return d[x][y];

		d[x][y] = 0; // 0���� �ʱ�ȭ�ؾ߸� ��ͷ� �Լ��� ȣ�� �� �� ���� ���� �� �ߺ��ؼ� ���������� �ʴ´�.

		for (int i = 0; i < 4; i++) {
			// ������������ �� �� �ִ� ��찡 �ֱ� ������ �� �迭 ��Ұ� 4���̹Ƿ� 4���� �ݺ����� ������.
			int nx = x + dx[i];
			int ny = y + dy[i];
			if ((nx >= 0 && nx < n) && (ny >= 0 && ny < m)) {
				// ���� ������ ���ư� ��
				if (a[x][y] > a[nx][ny]) // �̵��� ���� ���� �̵��ϱ� ���� ������ �۾ƾ��� .
					d[x][y] += go(a, d, nx, ny); // ���� �߿��ϴ�. �̵��� ��ǥ�� ��͸� �������Ѵ�. �ش� ���� x,y�� ����ؼ� �����ش�. �׸��� ��ȯ�Ѵ�.
			}
		}
		return d[x][y];
	}
}
