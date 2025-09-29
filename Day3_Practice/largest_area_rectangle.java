import java.util.*;
public class largest_area_rectangle {
    class Solution {
        public int largestRectangleArea(int[] arr) {
            int n = arr.length;
            int area = 0;
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i<n ; i++){
                while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                    int h = st.pop();
                    int r= i;
                    if(st.isEmpty()){
                        area = Math.max(area , h*r);
                    }
                    else{
                        int l = st.peek();
                        area = Math.max(area , h*(i-l-1));
                    }
                }
                st.push(i);
            }
            int r = arr.length;
            while(!st.isEmpty()){
                    int h = st.pop();
                    if(st.isEmpty()){
                        area = Math.max(area , h*r);
                    }
                    else{
                        int l = st.peek();
                        area = Math.max(area , h*(r-l-1));
                }
            }
            return area;
        }
    }
}
