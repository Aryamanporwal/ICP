
import java.util.*;

public class boats_to_save_people {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            //each boat - 2 people at most
            //boat ka limited size
            //infinite number of boat
            int boats = 0;
            Arrays.sort(people);
            int i=0,j=people.length-1;
            while(i<=j){
                if((people[j]+people[i])<=limit){
                    i++;
                }
                j--;
                boats++;
            }
            return boats;
        }
    }
}

