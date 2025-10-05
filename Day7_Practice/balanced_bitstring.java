package Day7_Practice;
import java.util.*;

public class balanced_bitstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String arr = sc.next();
            char[] s = arr.toCharArray();

            solve(n,k,s);
        }
        sc.close();
    }
    public static void solve(int n , int k , char[]s){        
    for(int i = 0; i<k ; i++){
                if(s[i]=='?'){
                    for(int j = i+k ; j<n ; j+= k){
                        if(s[j] !='?'){
                            s[i] = s[j];
                            break;
                        }
                    }
                }
            }

            

            for(int i = 0; i<k ; i++){
                if(s[i] != '?'){
                    for(int j = i+k ; j<n ; j+=k){
                        if(s[j] == '?'){
                            s[j] = s[i];
                        }
                        else if(s[j]!=s[i]){
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }

            int one = 0, zero = 0;

            for(int i =0 ; i<k ; i++){
                if(s[i] == '1'){
                    one++;
                }
                if(s[i] == '0'){
                    zero++;
                }
            }

            if(one<=(k/2) && zero <= (k/2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
