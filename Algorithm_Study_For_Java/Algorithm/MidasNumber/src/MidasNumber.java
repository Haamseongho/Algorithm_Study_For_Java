import java.util.Scanner;

public class MidasNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt1 = 0, cnt2 = 0;
		sc.close();
		boolean flag = false;
		
		for (int i = 2; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt1 += 1;
				}
				if (cnt1 == 2) {
					cnt1 = 0;
					if (j <= M) {
						flag = true;
						break;
					}
				}
				flag = false;
			}
			if (flag == true) {
				cnt2 += 1;
			}
		}
		System.out.println(cnt2);
	}
}
