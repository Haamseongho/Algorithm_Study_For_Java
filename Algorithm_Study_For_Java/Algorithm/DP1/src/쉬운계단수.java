import java.util.Scanner;

public class �����ܼ� {

	private static Scanner scanner;
	private static final int mod = 1000000000;
	private static int[][] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		d = new int[N+1][10];
		// ù ��° ���� --> N �� �� �� ����
		// �� ��° ���� --> 9 �� �� �� ����

		for (int i = 1; i <= 9; i++)
			d[1][i] = 1; // ù ��° �ٿ� ��� ���� ������� ���� �׷��� 9�� : ���� 1 

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				d[i][j] = 0; // 0 �ʱ�ȭ
				if (j - 1 >= 0)
					d[i][j] += d[i - 1][j - 1];
				if (j + 1 <= 9)
					d[i][j] += d[i - 1][j + 1];

				d[i][j] %= mod;
			}
		}
		
		long ans = 0;
		for(int i=0;i<=9;i++) 
			ans += d[N][i];
		
		ans %= mod;
		
		System.out.println(ans);
	}
}
