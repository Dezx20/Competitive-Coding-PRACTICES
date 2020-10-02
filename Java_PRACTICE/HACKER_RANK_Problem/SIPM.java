package HACKER_RANK_Problem;

import java.util.*;

public class SIPM {
    public  static void main(String[] arg){
        try {
            
        
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
   // s.next();
    while(t>0){
        t -=1;
        int n = s.nextInt();
      //  s.next();
        long minus_sum=0,plus_sum=0;
        long[] ar = new long[n];
        for(int i=0;i<n;i++){
            ar[i] = s.nextLong();
            
        }
        Arrays.sort(ar);
        long prev=0;
        for(int i=0;i<n;i++){
            if(i>0){
                if(prev == ar[i])   continue;
            }
            if(ar[i]<0){
                minus_sum += ar[i];
            }else{
                plus_sum += ar[i];
            }
            prev =ar[i];
        }
        System.out.println(plus_sum +" "+ minus_sum);
      //  s.next();
    }
    s.close();
} catch (Exception e) {
    //TODO: handle exception
    System.out.println(e);
}
}
}
