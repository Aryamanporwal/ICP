
import java.util.Arrays;

public class minimum_platform_needed {
        public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n = arr.length;
        int i = 0, j = 0;
        int platNeeded = 0, maxPlat = 0;
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platNeeded++;
                maxPlat = Math.max(maxPlat, platNeeded);
                i++;
            } else {
                platNeeded--;
                j++;
            }
        }
        
        return maxPlat;
    }
}
