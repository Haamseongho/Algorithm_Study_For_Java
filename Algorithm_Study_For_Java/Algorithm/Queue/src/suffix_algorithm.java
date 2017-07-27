import java.util.Scanner;
import java.util.*;

public class suffix_algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sb[] = new String[str.length()];
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			sb[i] = (str.substring(i, str.length()));
		}
		Arrays.sort(sb);
		
		for(int j=0;j<str.length();j++){
			System.out.println(sb[j]);
		}
	}
}
