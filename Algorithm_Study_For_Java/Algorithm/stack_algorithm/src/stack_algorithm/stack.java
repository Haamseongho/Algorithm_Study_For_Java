package stack_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		Stack stack = new Stack();
		int j = 0;

		for (int i = 0; i < 14; i++) {

			System.out.println("� ����� �����Ͻðڽ��ϱ�? \n" + "push / pop / data / size ");
			String select = sc.next();

			size = stack.size();

			if (select.equals("push")) {
				if (stack.isEmpty()) {
					System.out.println("���翡�� ������ ����ֽ��ϴ�. �߰��� ������ �־��ּ���");
				} else {
					System.out.println("push�� �����ϼ̽��ϴ�. \n" + "���ÿ� ���� ������ �Է��ϼ���.");
				}
				stack.push(sc.next());
				size++;
				j++;

			} else if (select.equals("pop")) {
				System.out.println("pop�� �����ϼ̽��ϴ�. \n" + "Last In First Out");
				stack.pop();
				size--;
				j--;
			} else if (select.equals("data")) {
				System.out.println("1. �ֱ� �����͸� �˻� / 2. ���ÿ� ���� ��� ������ �˻� (1or2)");
				int select2 = sc.nextInt();
				j = stack.size(); // �� �� �� ����..! ���� �� �ʿ�� ����.
				switch (select2) {
				
				case 1:
					System.out.println(stack.get(j - 1));
					break;

				case 2:
					try {
						while (j > 0) {
							System.out.println(stack.get(j - 1));
							j--;
						}

					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("ó�� data�� ã���Ŵٸ� ���ÿ� data�� ���� �״� ������ ������?");
					}

				default:
					break;
				}

			} else if (select.equals("size")) {
				System.out.println("size:" + size);
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}

}