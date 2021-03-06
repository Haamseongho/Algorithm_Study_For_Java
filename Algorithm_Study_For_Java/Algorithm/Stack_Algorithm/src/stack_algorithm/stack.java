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

			System.out.println("어떤 방법을 선택하시겠습니까? \n" + "push / pop / data / size ");
			String select = sc.next();

			size = stack.size();

			if (select.equals("push")) {
				if (stack.isEmpty()) {
					System.out.println("현재에는 스택이 비어있습니다. 추가할 내용을 넣어주세요");
				} else {
					System.out.println("push를 선택하셨습니다. \n" + "스택에 넣을 내용을 입력하세요.");
				}
				stack.push(sc.next());
				size++;
				j++;

			} else if (select.equals("pop")) {
				System.out.println("pop을 선택하셨습니다. \n" + "Last In First Out");
				stack.pop();
				size--;
				j--;
			} else if (select.equals("data")) {
				System.out.println("1. 최근 데이터만 검색 / 2. 스택에 쌓인 모든 데이터 검색 (1or2)");
				int select2 = sc.nextInt();
				j = stack.size(); // 한 번 더 해줌..! 굳이 할 필요는 없음.
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
						System.out.println("처음 data를 찾으신다면 스택엔 data가 없을 테니 에러가 나겠죠?");
					}

				default:
					break;
				}

			} else if (select.equals("size")) {
				System.out.println("size:" + size);
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

}
