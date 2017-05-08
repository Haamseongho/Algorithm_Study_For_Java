package stack_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class iron_stick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		System.out.println("��ȣ �ǽ� Ƚ�� : ");
		int size = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		while (size > 0) {
			System.out.print("��ȣ �Է�:");
			String bracket = sc.next();
			size--;
			if (bracket.equals("(")) {
				stack.push(cnt);
				cnt++;
			} else if (bracket.equals(")")) {
				if (stack.peek().equals(cnt-1)) {
					//System.out.print(stack.peek()+"/"+cnt);
					sum += 3;
					stack.pop();
				} else {
					//System.out.print(stack.peek());
					sum += 1;
					stack.pop();
				}
			}
		}
		System.out.println("���� : " + sum);
	}
}
