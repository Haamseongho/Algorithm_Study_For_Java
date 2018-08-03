package algorithm;

import java.util.Scanner;

public class 모든순열 {

	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] insArr = new int[N];
		for(int i=0;i<N;i++) {
			insArr[i] = (i+1);
		}
		// 1,2,3 입력
		do {
			for(int i=0;i<insArr.length;i++)
				System.out.print(insArr[i]+ " ");
			
			System.out.println("");
		}while(all_premutation(insArr));
		
	}

	private static boolean all_premutation(int[] a) {
		int i = a.length - 1;
		
		while(i > 0 && a[i-1] >= a[i] ) {
			i-=1;
		}
		
		if(i <= 0)
			return false;
		
		int j = a.length - 1;
		while(a[i-1] >= a[j] ) {
			j-=1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		int k = a.length - 1;
		while(k > i) {
			int temp2 = a[k];
			a[k] = a[i];
			a[i] = temp2;
			i+=1;
			k-=1;
		}
		return true;
	}
}
