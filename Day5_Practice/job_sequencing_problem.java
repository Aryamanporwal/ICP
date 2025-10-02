package Day5_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class job_sequencing_problem {
    class Solution {
        public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
            int n = profit.length;
            int jobs[][] = new int[n][2];

            for(int i = 0; i<n ; i++){
                jobs[i][0] = deadline[i];
                jobs[i][1] = profit[i];
            }

            Arrays.sort(jobs ,(a,b)->(b[1]-a[1]));

            int maxDeadline = 0;
            for(int i =0 ; i<n ; i++){
                maxDeadline = Math.max(maxDeadline , deadline[i]);
            }

            int slot[] = new int[maxDeadline+1];
            for(int i =0; i< maxDeadline+1 ; i++){
                slot[i] = i;
            }

            int maxprofit = 0;
            int maxJobs = 0;
            for(int i =0 ; i<n ;i++){
                int prof = jobs[i][1];
                int dl = jobs[i][0];

                int availSlots = find(slot , dl);
                if(availSlots > 0){
                    maxprofit += prof;
                    maxJobs++;
                    slot[availSlots] = find(slot , availSlots-1);
                }

            }
            ArrayList<Integer> res = new ArrayList<>();
            res.add(maxJobs);
            res.add(maxprofit);
            return res;
        }

        public int find(int [] slots , int s){
            if(slots[s] == s) return s;
            return slots[s] = find(slots , slots[s]);
        }
    }
}

