public class TapeEquilibrium {

	static int solution(int[] A) {
		double sum1 = 0;
		double sum2 = 0;
		double diff = 0;
		double minDiff = 0;
		
		for (int i = 0; i < A.length; i++) {
			sum2 += A[i]; // 우선 죄다 더해!
		}
		minDiff = 1000000;
		//System.out.print(minDiff);
		// minDiff는 최대 합을 준 다음에 이를 두 합간의 차의 절대값과 비교해서 
		
		for (int i = 0; i < A.length - 1 ; i++) {
			sum1 += A[i];
			sum2 -= A[i]; 
			/*
			 * sum1 = 3 (0+3)
			 * sum2 = 10 (13-3)
			 * diff = |3-10| = 7
			 * sum1 = 4 (3+1)
			 * sum2 = 9 (10-1)
			 * diff = |4-9| = 5
			 * ... 
			 */
			diff = (sum1 - sum2);
			minDiff = (int)Math.min(minDiff,Math.abs(diff));
			
		}
		return (int)minDiff;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4, 3 };
		System.out.print(solution(arr));
	}

}
