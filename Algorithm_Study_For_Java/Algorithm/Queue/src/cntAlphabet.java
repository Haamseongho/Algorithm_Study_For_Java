import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cntAlphabet {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력:");
		str = sc.next();

		int sArray[] = new int[26];

		for (int i = 0; i < str.length(); i++) {
			sArray[str.charAt(i) - 'a']++;
		}
		
		for(int j=0;j<sArray.length;j++){
			System.out.print(sArray[j]+" ");
		}
	}
}
