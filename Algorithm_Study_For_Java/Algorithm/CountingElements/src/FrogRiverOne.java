import java.util.Scanner;

class Solution {
  public static String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = {};
      int mok1[] = new int[n]; // ��1
      int mok2[] = new int[n];  // ��2
      int result[] = new int[n]; // ���
      
      for(int i=0;i<n;i++){
          if(arr1[i] / 2 == 0){
              mok1[i] = arr1[i] % 2;
              break;
          }else{
              mok1[i] = arr1[i] % 2;
          }
      }
      for(int i=0;i<n;i++){
          if(arr2[i] / 2 == 0){
              mok2[i] = arr2[i] % 2;
              break;
          }else{
              mok2[i] = arr2[i] % 2;
          }
      }
      for(int i=0;i<n;i++){
          if(mok1[i] + mok2[i] > 0){
              result[i] = 1;
          }else{
              result[i] = 0;
          }
      }
      
      for(int i=0;i<n;i++){
          if(result[i] == 1){
              answer[i] = "#";
          }else{
              answer[i] = "";
          }
      }
      return answer;
  }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        /*
        �Է� / �迭�� ũ�� 
        �迭�� ��ҵ� �Է� - arr1 , arr2 �Է� 
        ������ ��ȯ �� �հ����� �̿��Ͽ� # �Ǵ� " " ���� ��ȯ �� ���
        */
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        
    
        System.out.println(solution(n,arr1,arr2));
    }
}