import java.util.Scanner;

public class _123´õÇÏ±â {

	private static Scanner scanner;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while(count --> 0) {
			int n = scanner.nextInt();
			d = new int[n + 1];
			System.out.println(go(n));	
		}
	}

	private static int go(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;

		d[n] = go(n - 1) + go(n - 2) + go(n - 3);
		return d[n];
	}
}
