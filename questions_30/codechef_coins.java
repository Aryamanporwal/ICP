package questions_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codechef_coins {
    class Codechef
{
    static Map<Long, Long> dp = new HashMap<>();
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLong()){
		    long n=sc.nextLong();
		    System.out.println(find(n));
		}

	}
	public static long find(long n){
	    if(n==0){
	        return 0;
	    }
	    if (dp.containsKey(n)) return dp.get(n);
	    long ans=Math.max(n,find(n/2)+find(n/3)+find(n/4));
	    dp.put(n,ans);
	    return ans;
	}
}

}
