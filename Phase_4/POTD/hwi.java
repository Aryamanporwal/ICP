package Phase_4.POTD;
import java.util.*;
public class hwi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hands [] = new int[n];
        for(int i = 0; i<n ; i++){
            hands[i] = sc.nextInt();
        }
        int groupSize = sc.nextInt();
        System.out.println(canBeGrouped(groupSize , hands));
        sc.close();
    }
    private static boolean canBeGrouped(int groupSize, int[] hands) {
        if (hands.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int x : hands) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        while (!map.isEmpty()) {
            int start = map.firstKey(); // smallest available card

            for (int i = 0; i < groupSize; i++) {
                int key = start + i;

                if (!map.containsKey(key)) return false;

                int count = map.get(key) - 1;
                if (count == 0) map.remove(key);
                else map.put(key, count);
            }
        }

        return true;
    }

}
