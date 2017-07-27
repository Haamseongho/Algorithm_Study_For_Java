import java.util.Scanner;

public class Main_10844 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[][] = new int[n+1][10];

		long mod = 1000000000L;
		for (int i = 1; i <= 9; i++) {
			d[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				d[i][j] = 0;
				if(j-1>=0) d[i][j] += d[i-1][j-1];
				if(j+1<=9) d[i][j] += d[i-1][j+1];
				d[i][j] %= mod;
			}
		}
		long ans=0;
		for(int i=0;i<=9;i++)
			ans+= d[n][i];
		
		ans %= mod;
		System.out.println(ans);

	}

}
