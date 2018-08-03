import java.util.Scanner;

public class Ÿ��ä���_2133 {
	private static Scanner scanner;
	private static long[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new long[n + 1];

		d[0] = 1; // d[0] �̶� ���� ��� 3*0�� ä�� ���� �������� �ұ��ϰ� �ƹ��͵� ������ �ʱ� ���� 1�� ����ش�. (����� �����ؼ�.. ����� �ɿ��� �κ�)
		// ��ȭ���� �������ٸ� �ð����⵵�� ���� ����ϰ� �̸� ���ؼ� �ݺ����� �󸶳� ���� ������ üũ�Ѵ�.
		// ������ ������ ��ȭ���� ������ �״�� �ű�� DP�� �ϼ��̴�.
		
		for (int i = 2; i <= n; i++) {
			d[i] = 3 * d[i - 2];
			// �ʱ� ���� �� --> i-2 �ڸ��� �״�� ���� �����ǹǷ�
			for (int j = 1; j <= (i / 2) - 1; j++) {
				d[i] += 2 * d[i - 2 * (j + 1)];
			}
		}
		System.out.println(d[n]);
	}

}
