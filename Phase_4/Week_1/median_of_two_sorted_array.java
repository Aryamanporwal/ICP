package Phase_4.Week_1;
import java.util.*;
public class median_of_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for(int i = 0 ; i<m ; arr1[i++] = sc.nextInt());
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for(int j = 0 ; j<n ; arr2[j++] = sc.nextInt());

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                merged.add(arr1[i]);
                i++;
            }
            else {
                merged.add(arr2[j]);
                j++;
            }
        }

        while(i< m){
            merged.add(arr1[i]);
            i++;
        }
        while(j<n){
            merged.add(arr2[j]);
            j++;
        }

        int size = merged.size();
        // System.out.print(merged);
        if(size%2 == 1){
            System.out.println(merged.get(size/2));
        }
        else{
            double median = (merged.get(size/2 - 1) + merged.get(size/2)) / 2.0;
            System.out.println(median);
        }



        sc.close();
    }
}
