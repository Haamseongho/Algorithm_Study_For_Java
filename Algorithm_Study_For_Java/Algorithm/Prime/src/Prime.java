import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int n = sc.nextInt(); // 입력한 수 부터 150까지 소수 중 가장 큰 소수
		int p = 2;
		int m = 0;
		int r = 0;

		for (int i = 2; i < 100; i++) {
			r = n % i;
			m = (int) Math.sqrt(n);
			if (r == 0) {
				if (i > m) {
					p = n;
				}
				n += 1;
			} else {
				n = n + 1;
			}
			if (n > 150)
				break;
		}
		System.out.println("최대 값:" + p);
	}

}
