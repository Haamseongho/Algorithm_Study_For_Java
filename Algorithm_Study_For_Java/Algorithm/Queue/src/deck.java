import java.util.ArrayDeque;
import java.util.Scanner;

public class deck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

		while (num > 0) {
			switch (sc.next()) {
			case "push_back":
				deque.addLast(sc.nextInt());
				break;
			case "push_front":
				deque.addFirst(sc.nextInt());
				break;
			case "pop_back":
				if (!deque.isEmpty())
					deque.removeLast();
				else
					System.out.println("Deque is empty");
				break;

			case "pop_front":
				if (!deque.isEmpty())
					deque.removeFirst();
				else
					System.out.println("Deque is empty");
				break;

			case "size":
				System.out.println(deque.size());
				break;
			case "front":
				System.out.println(deque.peekFirst());
				break;
			case "empty":
				if (deque.isEmpty())
					System.out.println(0);
				else
					System.out.println(1);
				break;

			}
			num--;
		}

		for (int i = 0; i < num2; i++) {
			System.out.println("deque:" + deque.poll());
		}
	}

}
