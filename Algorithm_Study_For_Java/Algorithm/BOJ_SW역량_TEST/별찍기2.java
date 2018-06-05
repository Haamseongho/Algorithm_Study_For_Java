package algorithm;

import java.util.Scanner;

public class º°Âï±â2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int k = N;
		do {
			for(int i = 1 ; i <= N ; i++) {
				if(i >= k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			k--;
		}while(k > 0);
	
	}
	
}
