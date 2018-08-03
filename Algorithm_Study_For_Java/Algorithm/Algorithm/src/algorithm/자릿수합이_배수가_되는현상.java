package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class �ڸ�������_�����_�Ǵ����� {

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
		 * n�� base-1�� ������ ���� ��� base�� 6�̸� 2�� 3�� ����Ʈ�� ���� �մϴ�.
		 * 
		 */
		int j = 0; // �ε����� �迭
		ArrayList<Integer> digitList = new ArrayList<>();
		for (int i = 2; i < base; i++) {
			if (n % i == 0) {
				// ������ ������
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
