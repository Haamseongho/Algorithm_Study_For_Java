package algorithm;

public class Solution3 {
	public static void main(String[] args) {
		System.out.println(solution(2,4,2,4));
	}

	public static int solution(int A, int B, int C, int D) {
		
		double ans1 = Math.sqrt(Math.pow(A - C, 2) + Math.pow(B - D, 2));
		double ans2 = Math.sqrt(Math.pow(A - B, 2) + Math.pow(C - D, 2));
		double ans3 = Math.sqrt(Math.pow(A - D, 2) + Math.pow(B - C, 2));
		double[] ans = {ans1,ans2,ans3};
		double max = 0;
		
		// 세 차례 경우의 수
		for (int i = 0; i < ans.length; i++) {
			if(max < ans[i]) {
				max = ans[i];
			}
		}
		
		int result = (int) Math.pow(max, 2);
		return result;
	}
}
