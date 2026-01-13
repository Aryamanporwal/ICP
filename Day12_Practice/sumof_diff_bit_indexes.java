public class sumof_diff_bit_indexes {
    public static void main(String[] args) {
        int a  = 2;
        int b = 3;
        
        int xor = a ^ b; // XOR gives 1 where bits differ
           int index = 0;
           int sum = 0;
   
           while (xor > 0) {
               if ((xor & 1) == 1) { // if current bit differs
                   sum += index;
               }
               xor >>= 1;  // move to next bit
               index++;
           }
   
           System.out.print(sum);
    }
}
