import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PerMissingElem {
	static int solution(int[] A) {
		Set<Integer> hashSet = new HashSet<>();

		for (int i = 1; i <= A.length+1; i++)
			hashSet.add(i);

		for (int i = 0; i < A.length ; i++) {
			if (hashSet.contains(A[i]))
				hashSet.remove(A[i]);
			
		}

		return hashSet.iterator().next();
	}

	public static void main(String[] args) {
		int arr[] = {};
		// solution(arr);
		System.out.print(solution(arr));
	}

}
