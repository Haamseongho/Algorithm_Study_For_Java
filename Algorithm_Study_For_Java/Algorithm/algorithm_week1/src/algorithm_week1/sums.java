package algorithm_week1;

import java.util.Scanner;

public class sums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print(sumFactorial(num));
	}

	public static int sumFactorial(int num) {
		int sum = 0;
		if (num == 1) {
			return 1;
		} else {
			sum+=num;
		}
		return sum + sumFactorial(num-1);
	}
}