package End_Game.PYQ;
import java.util.*;
public class palindoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] words = new String[N];
        for(int i = 0 ; i<N ; i++){
            words[i] = sc.next();
        }
        List<List<Integer>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Step 1: store word -> index
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        
        // Step 2: process each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            for (int cut = 0; cut <= word.length(); cut++) {
                String prefix = word.substring(0, cut);
                String suffix = word.substring(cut);
                
                // Case 1: prefix palindrome
                if (reverse(prefix)) {
                    String revSuffix = new StringBuilder(suffix).reverse().toString();
                    
                    if (map.containsKey(revSuffix) && map.get(revSuffix) != i) {
                        System.out.println(map.get(revSuffix)+" "+ i);
                    }
                }
                
                // Case 2: suffix palindrome
                // cut != length to avoid duplicate
                if (cut != word.length() && reverse(suffix)) {
                    String revPrefix = new StringBuilder(prefix).reverse().toString();
                    
                    if (map.containsKey(revPrefix) && map.get(revPrefix) != i) {
                        System.out.println(i+" "+map.get(revPrefix));
                    }
                }
            }
        }
        sc.close();
    }

    public static boolean reverse(String word){
        int start = 0;
        int end = word.length()-1;

        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

class Pair{
    String rev;
    int idx;
    public Pair(String s , int i){
        this.rev = s;
        this.idx = i;
    }
}
