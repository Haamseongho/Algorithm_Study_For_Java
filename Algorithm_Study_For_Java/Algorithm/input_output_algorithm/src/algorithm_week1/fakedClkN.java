package algorithm_week1;

import java.util.Scanner;

public class fakedClkN {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int val = sc.nextInt();
	   while(val>0){
		   if(val<100000){
			   System.out.println(val);
			   val--;
		   }
	   }
	}

}
