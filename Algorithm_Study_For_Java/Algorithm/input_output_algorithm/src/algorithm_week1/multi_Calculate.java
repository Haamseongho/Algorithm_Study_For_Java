package algorithm_week1;

import java.util.Scanner;

public class multi_Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		for(int i=1;i<10;i++){
			System.out.println(val+"*"+i+"="+val*i);
		}
	}

}
