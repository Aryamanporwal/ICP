package End_Game.Maths;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) System.out.println(false);
        int temp = n;
        int s = 0;
        while(temp != 0){
            int r = temp%10;
            s = s*10+r;
            temp = temp/10;
        }

        System.out.println(n == s);
    }
}
