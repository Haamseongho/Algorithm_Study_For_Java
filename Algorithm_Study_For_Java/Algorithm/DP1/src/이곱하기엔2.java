import java.util.Scanner;

public class �̰��ϱ⿣2 {
	private static int[] d;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n+1];
		
		d[0] = 1;
		d[1] = 1;
		
		for(int i=2;i<=n;i++) {
			d[i] = d[i-1] + 2 * d[i-2];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}
}
