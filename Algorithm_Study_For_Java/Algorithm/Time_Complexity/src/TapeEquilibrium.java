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
		
		/*
		 * 문제 소개에서 범위가 너무 넓어서 생기는 문제가 발생하기 때문에 
		 * minDiff를 임의로 엄청 높게 잡았습니다.
		 * 이걸 두 합의 차의 절대값과 비교하여 최소 값이 되는 것을 찾아 
		 * 반환해주면 됩니다.
		 * 
		 */
		
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
			minDiff = Math.min(minDiff,Math.abs(sum1 - sum2));
			
			
			
		}
		return (int)minDiff;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4, 3 };
		System.out.print(solution(arr));
	}

}
