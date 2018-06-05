package algorithm;

import java.util.Scanner;

public class 별찍기4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// 별의 갯수 정의
		int k = 0;
		// 외부 반복문

		do {

			for (int i = 1; i <= N; i++) {
				if(i > k){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			k++;
		} while (k < N);
	}
}
