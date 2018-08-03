package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class 자릿수합이_배수가_되는현상 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ansArr = InterestingDigit(scanner.nextInt());

		for (int i = 0; i < ansArr.length; i++) {
			System.out.print("{" + ansArr[i] + "}");
		}
	}

	public static int[] InterestingDigit(int input) {
		int base = input;
		int n = base - 1;
		/*
		 * n이 base-1인 이유는 예를 들어 base가 6이면 2랑 3이 리스트에 들어가야 합니다.
		 * 
		 */
		int j = 0; // 인덱스의 배열
		ArrayList<Integer> digitList = new ArrayList<>();
		for (int i = 2; i < base; i++) {
			if (n % i == 0) {
				// 나누어 떨어짐
				digitList.add(j, i);
				j++;
			}
		}

		int[] newDigitArray = new int[digitList.size()];

		for (int i = 0; i < newDigitArray.length; i++) {
			newDigitArray[i] = digitList.get(i);

		}
		
		return newDigitArray;
	}
}
