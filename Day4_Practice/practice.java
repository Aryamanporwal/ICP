import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //display Hello World
        if(System.out.printf("Hello World") == null){

        }

        long num1 = 100*24*12*60*60L;
        //6220800000
        System.out.println("Long"+num1);

        //display number from 1 to n without using any integer in code
        //three variables given a, b,c , c can be 0 or 1 ,, when c = 1 print a if c = 0 print b without using if else, ternary operator etc
        int a = 23;
        int b = 100;
        int c = 0;
        int out = a*(c) + b*(1-c);

        sc.close();
    }
}
