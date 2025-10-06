package questions_30;

public class minimum_time_to_complete_trips {
    class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = Long.MAX_VALUE;
        long min = Long.MAX_VALUE;
        long high = 0;
        for(int t : time){
            low = Math.min(t , low);
            min = Math.min(t , min);
        }
        high = min*totalTrips;

        while(low<high){
            long mid = low+(high-low)/2;
            if(possible(mid, totalTrips , time)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean possible(long isvalidtime,int totalTrips,int[] time){
        long trips = 0;
        for(int t : time){
            trips+= isvalidtime/t;
        }

        if(trips>=totalTrips){
            return true;
        }
        return false;
    }
}
}
