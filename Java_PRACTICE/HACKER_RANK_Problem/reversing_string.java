package HACKER_RANK_Problem;

import java.io.*;
import java.util.*;
import java.lang.*;

public class reversing_string {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean t= true;
        String B = "";
        for(int i=0;i<A.length();i++){
            // if(A[i] == A[n-i-1])    continue;
            // else{
            //     t =false;
            //     break;
            // }
            B += A.substring(A.length()-1-i,A.length()-i);
        }
        
        if(A.compareTo(B) == 0) t=true;
        else t = false;
        if(t){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
