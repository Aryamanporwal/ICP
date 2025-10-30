package Holiday_HomeWork;
import java.util.*;
public class nastya_and_door {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt(); //number of mountains
            int k = sc.nextInt(); //length of doors

            int a[] = new int[n];
            for(int i =0; i<n ; i++){
                a[i] = sc.nextInt();
            }


            //k length ka segment jha max peak ho 
            // number of parts the door will be broken will be number of peeks+1
            // l is idx+1

            //we can apply sliding window
            boolean[] isPeak = new boolean[n];
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    isPeak[i] = true;
                }
            }
            int currPeaks = 0;
            for (int i = 1; i < k - 1; i++) {
                if (isPeak[i]) currPeaks++;
            }

            int maxPeaks = currPeaks;
            int bestStart = 0;

            for (int i = 1; i + k - 1 < n; i++) {
                if (isPeak[i]) currPeaks--;
                if (isPeak[i + k - 2]) currPeaks++;
                if (currPeaks > maxPeaks) {
                    maxPeaks = currPeaks;
                    bestStart = i;
                }
            }

            System.out.println((maxPeaks + 1) + " " + (bestStart + 1));
        }
    }
}
