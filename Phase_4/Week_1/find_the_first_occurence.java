package Phase_4.Week_1;
import java.util.*;
public class find_the_first_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String heystack = sc.next();
        String needle = sc.next();
        System.out.println(strStr(heystack , needle));
        sc.close();
    }
    public static int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m = needle.length();
        if(m>n) return -1;
        for(int i= 0 ; i<n-m ; i++){
            int len = i+n;
            if(haystack.substring(i, len).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
