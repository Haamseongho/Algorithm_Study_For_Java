import java.util.Scanner;

public class 파도반_수열 {

	private static Scanner scanner;
	private static long[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // test case

		d = new long[101];

		d[1] = 1;
		d[2] = 1;
		d[3] = 1;
		d[4] = 2;
		d[5] = 2;
		d[6] = 3;
		d[7] = 4;
		d[8] = 5;
		d[9] = 7;
		d[10] = 9;

		for (int i = 10; i <= 100; i++) {
			d[i] = d[i - 1] + d[i - 5];
		}

		while (t--> 0) {
			int n = scanner.nextInt();
			System.out.println(d[n]);
		}
	}

}
