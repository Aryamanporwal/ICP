package Day1_Practice;

public class second_largest_digit_in_string {
    class Solution {
        public int secondHighest(String s) {
            // HashSet<Integer> set = new HashSet<>();
            // for(int i = 0; i<s.length() ; i++){
            //     if((int)(s.charAt(i)) >= 48 && (int)(s.charAt(i))<=57){
            //         set.add((int)(s.charAt(i))-48);
            //     }
            // }
            // int n = set.size();
            // int arr[] = new int[n];
            // int j= 0;
            // for(int i : set){
            //     arr[j] = i;
            //     j++;
            // }

            // Arrays.sort(arr);
            // return (n>=2) ? arr[n-2]:-1;

            //approach two----------------->>>>
            // int max = Integer.MIN_VALUE;
            // int second = Integer.MIN_VALUE;
            // for(int num : set){
            //     if(num > max){
            //         second = max;
            //         max = num;
            //     }else if(num>second && num != max){
            //         second = num;
            //     }
            // }
            // return (second==Integer.MIN_VALUE) ? -1 : second;

            //approach three---------------->>>>
            int c = 2;
            for(char i = '9' ; i>='0' ; i--){
                if(s.indexOf(i)!=-1){
                    c--;
                }
                if(c==0){
                    return i-'0';
                }
            }

            return -1;
        }
    }
}
