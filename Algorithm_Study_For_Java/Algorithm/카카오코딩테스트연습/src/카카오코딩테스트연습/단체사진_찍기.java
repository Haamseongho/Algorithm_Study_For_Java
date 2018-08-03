package 카카오코딩테스트연습;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 단체사진_찍기 {

	private static Scanner scanner;
	private static int n;
	private static ArrayList<String> list;
	private static Stack<String> commandStack;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		n = scanner.nextInt(); // 횟수

		String[] command;
		command = new String[n];
		String kakaoFriends = "ACFJMNRT";
		list = new ArrayList<>();
		commandStack = new Stack<String>();

		for (int k = 0; k < n; k++)
			command[k] = scanner.next() + "";

		permutation(kakaoFriends, 0, 7, command);

		System.out.println(list.size());
	}

	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	private static void permutation(String str, int L, int F, String[] command) {
		
		
		commandStack.push(command[0]);
		String command1 = commandStack.pop();
		commandStack.push(command[1]);
		String command2 = commandStack.pop();
		
		if (L == F) {
			if (thePermuteCondition(str, command1) && thePermuteCondition(str, command2)) {
				list.add(str);
			}
		} else {
			for (int i = L; i <= F; i++) {

				str = swap(str, L, i);
				permutation(str, L + 1, F, command);
				//str = swap(str, L, i);

			}
		}
	}

	// input == 알파벳 나열
	// command == N~F=0

	private static boolean thePermuteCondition(String input, String command) {

		// 같을 조건
		if ((command.charAt(3) == '=')) {
			if (Math.abs((input.indexOf(command.charAt(0)))
					- input.indexOf(command.charAt(2))) == (Integer.parseInt(command.substring(4))) + 1) {

				return true;
			}
		}

		// 미만일 조건
		if ((command.charAt(3) == '<')) {
			if (Math.abs((input.indexOf(command.charAt(0))) - input.indexOf(command.charAt(2))) < (Integer
					.parseInt(command.substring(4)))) {

				return true;
			}
		}

		// 초과일 조건
		if ((command.charAt(3) == '>')) {
			if (Math.abs((input.indexOf(command.charAt(0)))
					- input.indexOf(command.charAt(2))) > (Integer.parseInt(command.substring(4))) + 1) {

				return true;
			}
		}
		return false;
	}
}
