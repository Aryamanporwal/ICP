package End_Game.Maths;
import java.util.*;
class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

    }
    public static double power(double x , int n){
        long n1 = n;
        if(n1 < 0){
            n1 = -n1;
            x = 1/x;
        }
        return pow(x , n1);
    }
    public static double pow(double x , long n){
        if(n == 1) return 1.0;

        double half = pow(x , n/2);
        double res = half*half;
        if(x%2 == 1){
            res = res*x;
        }
        return res;
    }
}