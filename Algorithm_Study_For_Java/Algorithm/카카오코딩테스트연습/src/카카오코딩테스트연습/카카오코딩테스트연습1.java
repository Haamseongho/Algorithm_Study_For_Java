package 카카오코딩테스트연습;

import java.util.Scanner;

public class 카카오코딩테스트연습1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		n %= 10;
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Welcome to Kakao Code Festival!");
		}
	}

}
