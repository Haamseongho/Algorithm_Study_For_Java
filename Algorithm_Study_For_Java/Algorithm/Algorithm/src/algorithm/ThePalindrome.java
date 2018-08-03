package algorithm;

import java.util.Scanner;

public class ThePalindrome {

	private static Scanner scanner;
	private static String s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		s = scanner.nextLine().trim();
		System.out.print(find(s));
	}

	public static int find(String str) {

		for (int i = str.length();; i++) {
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {
				if ((i - j - 1) < str.length() && str.charAt(j) != str.charAt(i - j - 1)) {
					flag = false;
					break;
				}
			}

			if (flag) {
				return i;
			}
		}
	}
}
