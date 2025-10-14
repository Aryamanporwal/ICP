package Day9_Practice;
import java.util.*;
public class game_with_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            if (n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }

    }
}
