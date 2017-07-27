import java.util.Scanner;

public class Main_11052 {
	public static int[] d;
	public static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n + 1];
		p = new int[n + 1];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			p[i] = d[i];
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = max(d[i], d[i - j] + p[j]);
			}
			System.out.println(d[i]);
		}
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}
