import java.util.*;
public class maximal_rectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if (matrix == null || matrix.length == 0) return 0;

            int n = matrix.length;
            int m = matrix[0].length;
            int[] heights = new int[m];
            int maxArea = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == '1') {
                        heights[j] += 1;
                    } else {
                        heights[j] = 0;
                    } 
                    
                }
                
                maxArea = Math.max(maxArea, largestrectangle(heights));
            }
            return maxArea;
        }
        public int largestrectangle(int []arr){
            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            int area = 0;
            for(int i =0 ; i<n; i++){
                while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                    int h = st.pop();
                    int r = i;
                    if(st.isEmpty()){
                        area = Math.max(area , h*r);
                    }else{
                        int l = st.peek();
                        area = Math.max(area , h*(r-l-1));
                    }
                }
                st.push(i);
            }
            int r = arr.length;
            while(!st.isEmpty()){
                int h = st.pop();
                if(st.isEmpty()){
                    area = Math.max(area ,h*r);
                }
                else{
                    int l = st.peek();
                    area = Math.max(area, h*(r-l-1));
                }
            
            }

            return area;

        }


    }
}
