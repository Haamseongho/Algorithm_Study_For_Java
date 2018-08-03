import java.util.Scanner;

public class Á¦°ö¼öÀÇ_ÇÕ {

	private static Scanner scanner;
	private static int d[];
	private static int a[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			d[i] = i;
			for (int j = 1; j * j <= i; j++) {
				if(d[i] > d[i-j*j] + 1)
					d[i] = d[i-j*j] + 1;
			}
		}
		System.out.println(d[n]);
	}

}
