import java.util.Scanner;

public class �ؾ_�Ǹ��ϱ� {

	private static Scanner scanner;
	private static int[] d; // OO�� �ȾƼ� ���� �� �ִ� �ִ� ����
	private static int[] p; // i�� �ȾƼ� ���� �� �ִ� i���� �� �Ǹ� ����
	private static int MAX;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		MAX = scanner.nextInt();
		d = new int[MAX + 1];
		p = new int[MAX + 1];

		d[0] = 0;
		p[0] = 0;
		
		for(int i=1;i<=MAX;i++) {
			p[i] = scanner.nextInt();
		}
		
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + p[j]);
			}
		}
		System.out.println(d[MAX]);
	}
}
