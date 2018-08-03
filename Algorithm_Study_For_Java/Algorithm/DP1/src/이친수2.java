import java.util.Scanner;

public class ÀÌÄ£¼ö2 {

	private static Scanner scanner;
	private static long[][] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new long[n + 1][2];

		d[1][0] = 0;
		d[1][1] = 1;
		d[2][0] = 1;
		d[2][1] = 0;

		for (int i = 3; i <= n; i++) {
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					d[i][j] = d[i - 1][0] + d[i - 1][1];
				} else {
					d[i][j] = d[i - 2][0] + d[i - 2][1];
				}
			}
		}

		System.out.println(d[n][0] + d[n][1]);
	}

}
