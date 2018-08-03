import java.util.Scanner;

public class ºØ¾î»§ÆÇ¸ÅÇÏ±â {
	private static Scanner scanner;
	private static int[] d;
	private static int[] p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n + 1];
		p = new int[n + 1];

		d[0] = 0;
		p[0] = 0;
		for (int i = 1; i <= n; i++) {
			p[i] = scanner.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + p[j]);
			}
		}

		System.out.println(d[n]);
	}

}
