package 큐;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class 로또 {

	private static Scanner scanner;
	private static Stack<Integer> ans = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		/*
		 * 7 1,2,3,4,5,6,7 입력
		 */
		while (true) {
			int k = scanner.nextInt();
			Stack<Integer> inputVecs = new Stack<Integer>();

			for (int i = 0; i < k; i++)
				inputVecs.add(scanner.nextInt()); // 입력 백터에 넣어주기

			go(inputVecs, 0, 0);
			scanner.nextLine();
		}

	}

	private static void go(Stack<Integer> vector, int index, int count) {

		int n = vector.size();
		if (n == index)
			return;

		if (count == 6) {
			for (int i = 0; i < count; i++) {
				System.out.print(ans.get(i));
			}
			System.out.println("");
			return;
		}
		ans.push(vector.get(index));
		System.out.print("vect: " + ans.get(index) + " \n");
		go(vector, index + 1, count + 1);
		ans.pop();
		go(vector, index + 1, count);
	}
}
