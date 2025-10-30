package Holiday_HomeWork;
import java.util.*;
public class nastya_and_rice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int grainmin = a-b;
            int grainmax = a+b;
            int wmin = c-d;
            int wmax = c+d;

            if(grainmin*n > wmax || grainmax*n < wmin){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
