package End_Game.PYQ;
import java.util.*;
public class burst_balloons_inorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0  ; i<n ; i++){
            arr.add(sc.nextInt());
        }


        Collections.sort(arr);

        reverse(0 , (n%2 == 0) ? n/2 : (n/2)+1 , arr);
        int prod = 0;
        for(int i = 0 ; i<=arr.size()-1 ; i++){
            int mid = arr.size()/2;

            if(arr.size()%2 == 0){
                mid -=1;
            }

            int curr = arr.get(mid);
            int left = 1;
            if(mid-1 >= 0){
                left = arr.get(mid-1);
            }

            int right = 1;
            if(mid+1 <= arr.size()-1){
                right = arr.get(mid+1);
            }

            prod += curr*left*right;

            arr.remove(mid);
        }


        System.out.println(prod);
        sc.close();
    }
    public static void reverse(int start , int end , ArrayList<Integer> arr){
        while(start < end){
            int temp = arr.get(start);
            arr.add(start , arr.get(end)); 
            arr.add(end , temp);
            start++;
            end--;
        }
    }
}
