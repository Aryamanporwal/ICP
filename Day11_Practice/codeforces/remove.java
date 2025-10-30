package Day11_Practice.codeforces;

import java.util.*;
public class remove{
    static long find(long a,String s)
    {
        int n=s.length();
        int x=0;
        long c=0;
        while(a>0)
        {
            if(s.charAt(x)=='B'){
                a/=2;
                c++;
            }
            else {
                int l=0;
                int q=x;
                while(s.charAt(q)=='A')
                {
                    l++;
                    q=(q+1)%n;
                    if(q==x)break;
                    
                }
                if(a>l){
                    a-=l;
                    c+=l;
                    x=q;
                    continue;
                }
                else{
                    c+=a;
                    break;
                }
            }
            x=(x+1)%n;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            String s=sc.next();
            boolean b=s.indexOf('B')!=-1;
            for(int i=0;i<q;i++)
            {
                long a =sc.nextLong();
                System.out.println(b?find(a,s):a);
            }
        }
    }
}