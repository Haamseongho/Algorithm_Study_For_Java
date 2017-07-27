import java.util.Scanner;

public class Main_1463 {

	public static int[] dNum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		dNum = new int[num + 1];
		System.out.println(slice(num));
	}

	public static int slice(int n) {

		if (n == 1)
			return 0;
		if (dNum[n] > 0)
			return dNum[n];

		dNum[n] = slice(n - 1) + 1;
		if (n % 2 == 0 && dNum[n] > slice(n / 2) + 1) {
			dNum[n] = dNum[n / 2] + 1;
		}
		if (n % 3 == 0 && dNum[n] > slice(n / 3) + 1) {
			dNum[n] = dNum[n / 3] + 1;
		}
		return dNum[n];
	}

}
