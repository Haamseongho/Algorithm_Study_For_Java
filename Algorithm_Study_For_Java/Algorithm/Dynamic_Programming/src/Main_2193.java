import java.util.Scanner;

public class Main_2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n+1];

		d[0] = 0;
		d[1] = 1;
		d[2] = 1;

		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}
		System.out.print(d[n]);
	}

}
