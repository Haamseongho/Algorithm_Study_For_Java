import java.util.Scanner;

public class Main_11726 {
	public static int[] sArray;
	public static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sArray = new int[n + 1];
		System.out.println(x2n(n));

	}

	public static int x2n(int n) {
		sArray[0] = 0;
		sArray[1] = 1;

		if (n == 0)
			return sArray[0];
		if (n == 1)
			return sArray[1];
		if (n == 2)
			sArray[n] = x2n(n - 1) + x2n(n - 2) + 1;
		else
			sArray[n] = x2n(n - 1) + x2n(n - 2);

		return sArray[n];
	}
}
