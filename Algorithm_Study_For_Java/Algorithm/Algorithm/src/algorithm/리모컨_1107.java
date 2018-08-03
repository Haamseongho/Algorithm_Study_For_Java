package algorithm;

import java.util.Scanner;

public class 리모컨_1107 {

	static boolean broken[];
	static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		broken = new boolean[10];
		scanner = new Scanner(System.in);
		int channel = scanner.nextInt();
		
		// 이동할 채널의 번호를 하나하나 분석 
		// 해결될 때 최대 500,000 인데 + 500,000 , - 500,000 이 가능하기 때문에
		// 반복문은 2*500,000 만큼 돌려야 한다.
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
