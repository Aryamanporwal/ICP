package questions_30;

public class can_place_flower {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            //plant tabhi ho sakta h jb n-1 and n+1 '0' ho otherwise nhi
            //boundary condition i = 0 mai sirf i+1 dekho
        //boundary condition
        int count = 0;
        for(int i = 0; i<flowerbed.length ; i++){
            if(flowerbed[i] == 0){
                boolean left  = (i==0)|| (flowerbed[i-1] == 0);
                boolean right = (i==flowerbed.length-1)||(flowerbed[i+1] == 0);

                if(left && right){
                    flowerbed[i] = 1;
                    count++;
                }
            }

        }

        return count>=n;

        }  
    }
}
