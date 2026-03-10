
package End_Game;
import java.util.*;

public class Food_Stamps {

    static class Food {
        long taste;
        long decrease;

        Food(long taste, long decrease) {
            this.taste = taste;
            this.decrease = decrease;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] v = new long[n];
        long[] d = new long[n];

        for (int i = 0; i < n; i++)
            v[i] = sc.nextLong();

        for (int i = 0; i < n; i++)
            d[i] = sc.nextLong();

        PriorityQueue<Food> pq =
                new PriorityQueue<>((a, b) -> Long.compare(b.taste, a.taste));

        for (int i = 0; i < n; i++) {
            pq.add(new Food(v[i], d[i]));
        }

        long result = 0;
        long meals = 0;

        while (!pq.isEmpty() && meals < m) {

            Food f = pq.poll();

            if (f.taste <= 0)
                break;

            result += f.taste;
            meals++;

            long nextTaste = f.taste - f.decrease;

            if (nextTaste > 0)
                pq.add(new Food(nextTaste, f.decrease));
        }

        System.out.println(result);

        sc.close();
    }
}