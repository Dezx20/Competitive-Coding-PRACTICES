package HACKER_RANK_Problem;

import java.util.Scanner;

public class substringcomp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String temp = s.substring(0,k);
        smallest = temp;
        largest = temp;
        for(int i=0;i<s.length()-k+1;i++){
            temp = s.substring(i,i+k);
            if(smallest.compareTo(temp) > 0){
                smallest = temp;
            }
            if(largest.compareTo(temp) < 0){
                largest = temp;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}