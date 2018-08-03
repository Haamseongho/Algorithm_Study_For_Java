import java.util.Scanner;

public class �պ���_2225 {

	private static Scanner scanner;
	private static long d[][];
	private static final long mod = 1000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt(); // ���� s���� ���ؼ� n�� ���� ����.
		d = new long[k + 1][n + 1];

		d[0][0] = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j <= n; j++) { // 0���� n������ ������ ���� �� �ִ� ���� �� --> 0���� n���� �����ϱ⿡ 0���� n���� ����
				// ���� ���, 0�̸� (0+0+0+0+ ... ) -->k����ŭ 
				// n�̸�, (0+n,1+(n-1),.....,(n+0)); --> k�� ��ŭ ����.
				for (int l = 0; l <= j; l++) {
					d[i][j] += d[i - 1][j - l];
					d[i][j] %= mod;
				}
			}
		}
		System.out.println(d[k][n]);
	}
}
