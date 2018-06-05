package algorithm;

import java.util.Scanner;

public class 최소_최대 {

	static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println(solution(scanner.nextInt()));
	}

	static String solution(int N) {
		int[] array = new int[N];
		int max = 1;
		int min = 10000;
		
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
			if (Math.min(min, array[j]) == array[j]) {
				min = array[j];
			}
			if (Math.max(max, array[j]) == array[j]) {
				max = array[j];
			}
		}

		String answer = min + " " + max;
		return answer;
	}
}
