import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class toFindAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sArray[] = new int[26];
		int pos[] = new int[26];

		HashMap<Integer, String> hash_before = new HashMap<>();
		HashMap<Integer, Integer> hash_after = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			hash_before.put(i, str.substring(i, i + 1));
		}

		for (int j = 0; j < str.length(); j++) {
			hash_after.put(hash_before.get(j).charAt(0) - 'a', j);
		}

		for (int k = 0; k < 26; k++) {
			if (!hash_after.isEmpty()) {
				System.out.print(hash_after.get(k) + " ");
			}

		}
	}

}
