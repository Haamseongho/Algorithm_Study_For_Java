package algorithm;

import java.util.Scanner;

public class N��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int D = scanner.nextInt();

		System.out.println(solution(M, D));

	}



	// x = �� , y = ��
	static String solution(int month, int day) {
		/*
		 * x�� 1~12 , y�� 1~31
		 */
		String[] date = { "��", "ȭ", "��", "��", "��", "��", "��" };
		String answer = "";
		switch (month) {
		case 1:
			day = day % 7 - 1;
			answer += date[day % 7];
			return answer;
		case 2:
			day += 30;
			answer += date[day % 7];
			return answer;

		case 3:
			day = day + 30 + 28;
			answer += date[day % 7];
			return answer;

		case 4:
			day = day + 30 + 28 + 31;
			answer += date[day % 7];
			return answer;
		case 5:
			day = day + 30 + 28 + 31 + 30;
			answer += date[day % 7];
			return answer;
		case 6:
			day = day + 30 + 28 + 31 + 30 + 31;
			answer += date[day % 7];
			return answer;
		case 7:
			day = day + 30 + 28 + 31 + 30 + 31 + 30;
			answer += date[day % 7];
			return answer;
		case 8:
			day = day + 30 + 28 + 31 + 30 + 31 + 30 + 31;
			answer += date[day % 7];
			return answer;
		case 9:
			day = day + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			answer += date[day % 7];
			return answer;
		case 10:
			day = day + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			answer += date[day % 7];
			return answer;
		case 11:
			day = day + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			answer += date[day % 7];
			return answer;
		case 12:
			day = day + 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			answer += date[day % 7];
			return answer;
		}

		return answer;
	}
}
