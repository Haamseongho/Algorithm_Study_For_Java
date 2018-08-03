package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println(solution("A586QK", "JJ653K"));
	}

	public static int solution(String A, String B) {
		int winTimes = 0;
        LinkedHashMap<String, String> map1 = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> map2 = new LinkedHashMap<String, String>();


        //String A, String B 에서 값 받아와서 map 에 순서대로 저장한거임
        for(int i=0; i<A.length(); i++)
        {
            String i2=String.valueOf(i);
            String change1;
            String change2;

            char a =A.charAt(i);
            change1 = Character.toString(a);
            if(change1.equals("A")){
                change1="14";
            }
            if(change1.equals("K")){
                change1="13";
            }
            if(change1.equals("Q")){
                change1="12";
            }
            if(change1.equals("J")){
                change1="11";
            }


            char b =B.charAt(i);
            change2 = Character.toString(b);
            if(change2.equals("A")){
                change2="14";
            }
            if(change2.equals("K")){
                change2="13";
            }
            if(change2.equals("Q")){
                change2="12";
            }
            if(change2.equals("J")){
                change2="11";
            }

            map1.put(i2,change1);
            map2.put(i2,change2);

        }

        Iterator keyData1 = map1.keySet().iterator();
        String k,v;

        Iterator keyData2 = map2.keySet().iterator();
        String n,m;


        while(keyData1.hasNext()){
            k=(String)keyData1.next();
            v=(String)map1.get(k);
            System.out.println(k+":"+v);

            while(keyData2.hasNext()){


                int v1=Integer.parseInt(v);

                n=(String)keyData2.next();
                m=(String)map2.get(n);
                int m1=Integer.parseInt(m);
                System.out.println(n+":"+m);
                if(v1-m1 >0){
                    winTimes++;
                }
                break;
            }
        }

        return winTimes;
    }
}
