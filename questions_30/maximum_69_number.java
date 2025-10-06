package questions_30;

public class maximum_69_number {
    class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int digits[]  = new int[str.length()];
        for(int i = 0; i<str.length() ; i++){
            digits[i] = str.charAt(i)-'0';
        }

        for(int i = 0; i<digits.length ; i++){
            if(digits[i] == 6){
                digits[i] = 9;
                break;
            }
        }

        int ans = 0;
        int n = digits.length;
        for(int i = n-1 ; i>= 0; i--){
            ans+= digits[i] *Math.pow(10 , (n-i-1));
        }
        return ans;
    }
}
}
