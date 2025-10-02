package Day5_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class job_sequencing_problem {
    class Solution {
        public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
            // code here
            int n = deadline.length;
            int [][] jobs = new int[n][2];
            for(int i = 0; i<n ; i++){
                jobs[i][0] = deadline[i];
                jobs[i][1] = profit[i];
            }
            
            Arrays.sort(jobs, (a,b)->(b[1]-a[1]));
            //target ye h , jiski deadline km ho or profit jyda ho
            boolean dead[] = new boolean[n];
            int maxProfit = 0;
            int maxJob = 0;
            for(int i = 0; i<n  ; i++){
                if(dead[jobs[i][0]-1] == false){
                    dead[jobs[i][0]-1] = true;
                    maxProfit += jobs[i][1];
                    maxJob++;
                }
                else if(dead[jobs[i][0]-1] == true){
                    int temp = jobs[i][0]-2;
                    while(temp>=0){
                    if(dead[temp] == false){
                        dead[temp] = true;
                        maxProfit += jobs[i][1];
                        maxJob++;
                        break;
                        } 
                        temp--;
                    }
                                    
                }
            }
            ArrayList<Integer> res = new ArrayList<>();
            res.add(maxJob);
            res.add(maxProfit);
            return res;
        }
    }
}
