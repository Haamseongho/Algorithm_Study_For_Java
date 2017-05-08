package algorithm_week1;

import java.util.Scanner;

public class clickN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int result=1;
		while (val > 0) {
			System.out.println(result);
			val--;
			result++;
		}
	}

}
