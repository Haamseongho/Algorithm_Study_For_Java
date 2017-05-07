package algorithm_week1;

import java.util.Scanner;

public class algorithm_week1 {

	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2;
		int count;
		int i=0;
		
		while(scanner.hasNextInt()){
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			System.out.println(num1 + num2);
			i++;
		}
	}

}
