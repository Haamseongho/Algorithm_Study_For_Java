package algorithm;

import java.util.Scanner;

public class ������_1107 {

	static boolean broken[];
	static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		broken = new boolean[10];
		scanner = new Scanner(System.in);
		int channel = scanner.nextInt();
		
		// �̵��� ä���� ��ȣ�� �ϳ��ϳ� �м� 
		// �ذ�� �� �ִ� 500,000 �ε� + 500,000 , - 500,000 �� �����ϱ� ������
		// �ݺ����� 2*500,000 ��ŭ ������ �Ѵ�.
		if(possible(channel)) {
			
		}
	}

	static boolean possible(int c) {
		
		if(c == 0) {
			if(broken[0]) {
				return false;
			}else {
				return true;
			}
		}
		while (c > 0) {
			if (broken[c % 10])
				return false;

			c /= 10;
		}
		return true;
	}
}
