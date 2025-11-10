package Day12_Practice.codeforce;
import java.util.*;
public class strobogrammatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //strobogrammatic pairs
        // 0 -> 0
        // 1 -> 1
        // 2 -> 2
        // 3 -> E
        // 5 -> 5
        // 6 -> 9
        // 8 -> 8
        // 9 -> 6
        // E -> 3
        int n = s.length();
        int ans = 0;
        int low = 0;
        int high = n-1;
        while(low<=high){
            if(s.charAt(low) == s.charAt(high)){
                if(s.charAt(low)=='0' || s.charAt(high)=='1'  || s.charAt(high)=='2'  || s.charAt(high)=='3'  || s.charAt(high)=='5'  || s.charAt(high)=='6'  || s.charAt(high)=='8'  || s.charAt(high)=='9'  || s.charAt(high)=='E'){
                    ans += 0;
                }else{
                    ans += 2;
                }
                low++;
                high--;
            }
            else {
                if((s.charAt(high)=='0' || s.charAt(high)=='1'  || s.charAt(high)=='2'  || s.charAt(high)=='3'  || s.charAt(high)=='5'  || s.charAt(high)=='6'  || s.charAt(high)=='8'  || s.charAt(high)=='9'  || s.charAt(high)=='E') && (s.charAt(low)!='0' || s.charAt(low)!='1'  || s.charAt(low)!='2'  || s.charAt(low)!='3'  || s.charAt(low)!='5'  || s.charAt(low)!='6'  || s.charAt(low)!='8'  || s.charAt(low)!='9'  || s.charAt(low)!='E')){
                    ans += 1;
                }else if( (s.charAt(low)=='0' || s.charAt(low)=='1'  || s.charAt(low)=='2'  || s.charAt(low)=='3'  || s.charAt(low)=='5'  || s.charAt(low)=='6'  || s.charAt(low)=='8'  || s.charAt(low)=='9'  || s.charAt(low)=='E') && (s.charAt(high)=='0' || s.charAt(high)=='1'  || s.charAt(high)=='2'  || s.charAt(high)=='3'  || s.charAt(high)=='5'  || s.charAt(high)=='6'  || s.charAt(high)=='8'  || s.charAt(high)=='9'  || s.charAt(high)=='E') ){
                    ans+=1;
                }else{
                    ans+=2;
                }
                low++;
                high--;
            }
        }
        System.out.println(ans);
    }
}
