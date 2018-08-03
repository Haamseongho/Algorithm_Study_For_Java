import java.util.Scanner;

public class _123더하기3 {

	private static Scanner scanner;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int t = scanner.nextInt(); // 테스트케이스

		while (t-- > 0) {
			int n = scanner.nextInt();

			d = new int[n + 1];

			d[0] = 0;
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;

			for (int i = 3; i <= n; i++) {
				d[i] = d[i - 1] + d[i - 2] + d[i - 3];
			}

			System.out.println(d[n]);
		}

	}

}
