package Phase_4.Week_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule_IV {
    HashMap<Integer, ArrayList<Integer>> hm;
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] qu) {

        hm = new HashMap<>();
        for (int i = 0; i < n; i++) hm.put(i, new ArrayList<>());

        for (int[] i : pre) hm.get(i[0]).add(i[1]);

        int in[] = new int[n];
        for (int arr : hm.keySet())
            for (int i : hm.get(arr))
                in[i]++;

        boolean[][] r = new boolean[n][n];

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (in[i] == 0) q.add(i);

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i : hm.get(curr)) {
                r[curr][i] = true;
                for (int j = 0; j < n; j++)
                    if (r[j][curr]) r[j][i] = true;

                if (--in[i] == 0) q.add(i);
            }
        }

        List<Boolean> ans = new ArrayList<>();
        for (int[] i : qu)
            ans.add(r[i[0]][i[1]]);

        return ans;
    }

}
