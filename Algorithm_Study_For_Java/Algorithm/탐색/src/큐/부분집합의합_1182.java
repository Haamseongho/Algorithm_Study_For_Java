package 큐;

import java.util.*;

public class 부분집합의합_1182 {
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
			// 합으로 정한 S값이 다 더한 sum과 같아 버리면 1을 반환 --> 재귀로 합쳐져서 답이 나옴 
			if(S == sum) {
				return 1;
			}else {
				return 0; // 종료 조건 : 길이가 같은데 정해놓은 합과 다를 경우 종료 
			}
		}
		

		return go(A,S,index+1,cnt+1,sum+A[index]) + go(A,S,index+1,cnt+1,sum);
	}
}
