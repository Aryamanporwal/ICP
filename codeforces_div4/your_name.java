import java.util.*;
public class your_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            int freq1[] = new int[26];
            int freq2[] = new int[26];
            for(int i =0; i<n ; i++){
                freq1[s.charAt(i)-'a']++;
                freq2[t.charAt(i)-'a']++;
            }
            int flag = 0;
            for(int i = 0; i<26 ; i++){
                if(freq1[i] != freq2[i]){
                    flag = 1;    
                }
            }
            System.out.println(flag==0?"YES":"NO");
        }
        sc.close();
    }
}
