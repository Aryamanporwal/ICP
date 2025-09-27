package Day2_Practice;

public class upperOrlowerBound {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,4,7,9};
        for(int i = 0; i<7 ; i++){
            System.out.println(lowerBound(arr , i));
            // System.out.println(lb(arr , 1));
            // System.out.println(lb(arr , 2));
            // System.out.println(lb(arr , 3));
            // System.out.println(lb(arr , 4));
            // System.out.println(lb(arr , 5));
            // System.out.println(lb(arr , 6));
            // System.out.println(lb(arr , 7));
            // System.out.println(lb(arr , 9));
        }
    }

    // public static int lb(int arr[] , int target){
    //     int low = 0;
    //     int high = arr.length-1;
    //     while(low<=high){
    //         int mid = low+(high-low)/2;
    //         if(arr[mid] == target){
    //             int li = mid;
    //             while(li >= 0 && arr[li-1] == target){
    //                 li--;
    //             }
    //             return li;
    //         }
    //         else if(arr[mid] > target){
    //             high = mid-1;
    //         }else{
    //             low = mid+1;
    //         }
    //     }
    //     return low;
    // }

    // public static int lowerBound(int []arr , int target){
    //     int low = 0;
    //     int high = arr.length;
    //     while(low<high){
    //         int mid = low+(high-low)/2;
    //         if(arr[mid] < target){
    //             low = mid+1;
    //         }else if(arr[mid]>=target){
    //             high = mid;
    //         }
    //     }
    //     return low;
    // }
    public static int lowerBound(int []arr , int target){
        int low = 0;
        int high = arr.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= target){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
}
