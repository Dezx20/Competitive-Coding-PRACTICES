package HACKER_RANK_Problem;
import java.util.*;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

            char ca[] = a.toCharArray();
            char cb[] = b.toCharArray();
            Arrays.sort(ca);
            Arrays.sort(cb);
            if(a.length() == b.length()){
                for(int i=0;i<a.length();i++){
                    if(ca[i] == cb[i])  continue;
                    else return false;
                }
            }else{
                return false;
            }
     return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
