package algorithm_week1;

import java.util.Scanner;

public class sum_with_comma_10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number;
		String cNumber[];
		number = scanner.next();
		cNumber = number.split(",");

		int sum = Integer.parseInt(cNumber[0]) + Integer.parseInt(cNumber[1]);
		System.out.println("гу:" + sum);
	
	}

}
