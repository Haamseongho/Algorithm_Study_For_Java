package ť;

import java.util.*;

public class �κ���������_1182 {
	private static Scanner scan;
	private static int[] input;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		int S = scan.nextInt();
		int index = 0;
		input = new int[N];
		
		
		
		while(N-->0) {
			input[index] = scan.nextInt();
			index+=1;
		}
		
		int ans = go(input,S,0,0,0);
		
		if(S == 0)
			ans -= 1;
		
		System.out.println(ans);
	}

	private static int go(int[] A, int S, int index, int cnt, int sum) {

		if(index == -1)
			return -1;
		
		if (A.length == index) {
			// ������ ���� S���� �� ���� sum�� ���� ������ 1�� ��ȯ --> ��ͷ� �������� ���� ���� 
			if(S == sum) {
				return 1;
			}else {
				return 0; // ���� ���� : ���̰� ������ ���س��� �հ� �ٸ� ��� ���� 
			}
		}
		

		return go(A,S,index+1,cnt+1,sum+A[index]) + go(A,S,index+1,cnt+1,sum);
	}
}
