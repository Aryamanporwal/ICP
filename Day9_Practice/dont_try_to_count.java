import java.util.*;
public class dont_try_to_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(x);
            System.out.println(counter(sb , s));

        }
    }

    public static int counter(StringBuilder sb, String s) {
        if (sb.toString().contains(s)) return 0;
        int count = 0;

        while (sb.length() <= 25) { 
            sb.append(sb.toString());
            count++;
            if (sb.toString().contains(s)) {
                return count;
            }
        }

        return -1;
    }
}
