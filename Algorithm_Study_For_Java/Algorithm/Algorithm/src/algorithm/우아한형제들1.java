package algorithm;

import java.util.EmptyStackException;
import java.util.Stack;

public class 우아한형제들1 {
	static Stack<Integer> stack = new Stack<Integer>();;

	public static void main(String[] args) {
		try {

			System.out.println(solution("DUP"));
			System.out.println(solution("DUP"));
			System.out.println(solution("4"));
			System.out.println(solution("POP"));
			System.out.println(solution("5"));
			System.out.println(solution("DUP"));
			System.out.println(solution("+"));
			System.out.println(solution("DUP"));
			System.out.println(solution("+"));
			System.out.println(solution("-"));
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}

	}

	public static int solution(String S) {

		if (isIntegerNum(S)) {
			stack.push(Integer.parseInt(S));
		} else {
			switch (S) {
			case "DUP":
				if (stack.isEmpty())
					return -1;
				else
					stack.push(stack.peek());
				break;
			case "POP":
				if (stack.isEmpty())
					return -1;
				else
					stack.pop();
				break;
			case "+":
				if (stack.isEmpty() || stack.size() == 1)
					return -1;
				else {
					int num1 = stack.pop();
					int num2 = stack.pop();
					stack.push(num1 + num2);
				}
				break;

			case "-":
				if (stack.isEmpty() || stack.size() == 1)
					return -1;
				else {
					int num3 = stack.pop();
					int num4 = stack.pop();

					if (num3 < num4)
						return -1;
					else
						stack.push(num3 - num4);
				}
				break;

			}
		}
		return stack.peek();
	}

	public static boolean isIntegerNum(String S) {
		try {
			Integer.parseInt(S);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
