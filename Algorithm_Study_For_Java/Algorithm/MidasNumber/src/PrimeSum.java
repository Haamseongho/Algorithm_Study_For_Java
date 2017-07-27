import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int num;
		sc.close();

		for (int i = M; i <= N; i++) {
			num = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					num += 1;
				}
				if (num > 1)
					break;
			}
			if (num == 1) {
				sum += i;
			}
		}
		if (sum != 0)
			System.out.println(sum);
		else
			System.out.println(-1);
	}

}
