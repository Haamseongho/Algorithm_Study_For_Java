package stack_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class bracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		System.out.println("��ȣ �ǽ� Ƚ�� : ");
		int size = sc.nextInt();
		int cnt = 0;
		while (size > 0) {
			System.out.print("��ȣ �Է�:");
			String bracket = sc.next();
			size--;
			stack.push(bracket);
		}
		// Check Yes Or No
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i).equals("(")) {
				cnt += 1;
			} else {
				cnt -= 1;
			}
			if (cnt < 0) {
				System.out.println("NO");
			}
		}
		if (cnt == 0) { // stack is empty == good
			System.out.println("YES");
		} else { // stack is not empty == wrong
			System.out.println("NO");
		}
	}
}
