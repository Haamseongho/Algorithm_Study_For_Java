package algorithm;

public class 암호_전체탐색2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans = {1,2,3};
		System.out.println(getHighestAns(ans));
	}

	static int getHighestAns(int[] number) {
		int max = 0;

		for (int i = 0; i < number.length; i++) {
			int mul = 0;
			for (int j = 0; j < number.length; j++) {
				if (i == j)
					mul = (number[i] + 1) * number[j];
				else
					mul = number[i] * (number[j]);
			}
			
			if(max < mul)
				max = mul;
		}
		return max;
	}

}
