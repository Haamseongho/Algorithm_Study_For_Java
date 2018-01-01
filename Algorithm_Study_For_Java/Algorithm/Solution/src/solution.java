import java.util.Scanner;

class Solution {
  public static int solution(String dartResult) {
      int answer = 0;
      String[] result = dartResult.split(":");
      System.out.print(result[0]+"/"+result[1]+"/"+result[2]);
      return answer;
  }
    
  
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int point[] = new int[3];
        String bonus[] = new String[3];
        String option[] = new String[3];
        String dartPoint[] = new String[3];
        String rDartPoint = "";
        for(int i=0;i<3;i++){
            point[i] = sc.nextInt(); // 0 - 10 사이
            bonus[i] = sc.next(); // S,D,T 중 하나
            option[i] = sc.next(); // * , # , ""중 하나
            dartPoint[i] = point[i] +":"+bonus[i]+":"+option[i];
        }
        
        rDartPoint = dartPoint[0]+dartPoint[1]+dartPoint[2];
        
        solution(rDartPoint);
        
    }
    
}