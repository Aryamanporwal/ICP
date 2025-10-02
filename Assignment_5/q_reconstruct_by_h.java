import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q_reconstruct_by_h {
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people , (a,b)->{
                if(a[0]==b[0]) return a[1]-b[1];
                else return b[0]-a[0];
            });

            List<int[]> res = new ArrayList<>();
            for (int[] person : people) {
                res.add(person[1], person);
            }

            return res.toArray(new int[people.length][]);

        }
    }
}
