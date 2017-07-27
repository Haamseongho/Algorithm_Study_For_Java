import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int N = sc.nextInt();
		int T = 0;
		int j = 2;
		if (N >= 2) {
			while (N != 1) {
				if (N % j == 0) {
					arr[T] = j;
					T += 1;
					N = N / j;
				} else {
					j += 1;
				}
			}
		} else {
			System.out.println("소인수 판별 불가능");
		}
		if (T == 1) {
			System.out.println("소수입니다.");
		}
		for (int i = 0; i < T; i++) {
			if (i == T)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] +",");
		}
	}
}
