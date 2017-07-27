import java.util.*;

public class BinaryGap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
	
	public static int solution(int N)
	{
		int num = N;
		int stack_size;
		int big = 0, total = 0;
		Stack<Integer> stack_binary = new Stack<Integer>();
		
		while(num > 1)
		{
			stack_binary.push(num%2);
			num = num / 2;
		}
		stack_binary.push(num);
		
		stack_size = stack_binary.size();
		
		for(int i = stack_size - 1; i>=0 ;i--)
		{
			if(stack_binary.elementAt(i) == 1)
			{
				if(total >= big)
					big = total;
				total = 0;
			}
			else
				total += 1;
		}
		
		return big;
		
	}

}