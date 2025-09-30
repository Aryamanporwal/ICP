package Day4_Practice;
import java.util.*;
public class find_all_anagram_in_a_given_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
    //Brute code----------->
    public static List<Integer> findAnagram(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            int k = p.length();
            for(int i = 0; i<s.length()-k+1 ; i++){
                String temp = s.substring(i, i+k);
                if(isAnagram(temp , p)){
                    ans.add(i);
                }
            }
            return ans;

        }
    public static boolean isAnagram(String s , String p){
            int freqs[] = new int[26];
            int freqp[] = new int[26];
            for(int i = 0; i<s.length() ; i++){
                char ch = s.charAt(i);
                freqs[(int)ch-97]++;
            }
            for(int i = 0; i<p.length() ; i++){
                char ch = p.charAt(i);
                freqp[(int)ch-97]++;
            }

            for(int i = 0 ;i <26 ; i++){
                if(freqs[i]!=freqp[i]){
                    return false;
                }
            }
            return true;

    }

    //Sliding Window

    public List<Integer> findAnagrams(String s , String p){
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int k = p.length();
        if(n<k) return ans;

        int []freqp = new int[26];
        int []freqs = new int[26];

        for(char c : p.toCharArray()){
            freqp[c-'a']++;
        }

        for(int i =0 ; i<k ; i++){
            freqs[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(freqp , freqs)){
            ans.add(0);
        }

        //sliding window

        for(int i = k ; i<n ; i++){
            freqs[s.charAt(i)-'a']++;
            freqs[s.charAt(i-k)-'a']--;

            if(Arrays.equals(freqs , freqp)){
                ans.add(i-k+1);
            }
        }
        return ans;
    }   
}
