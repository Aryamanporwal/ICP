package Day6_Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class permutations {
    class Solution {
        HashSet<String> set = new HashSet<>();

        public ArrayList<String> findPermutation(String s) {
            char[] arr = s.toCharArray();
            recur(0, arr);
            return new ArrayList<>(set);
        }

        public void recur(int idx, char[] arr) {
            if (idx == arr.length) {
                set.add(new String(arr)); // add unique permutation
                return;
            }

            for (int i = idx; i < arr.length; i++) {
                swap(arr, idx, i);
                recur(idx + 1, arr);
                swap(arr, idx, i);
            }
        }

        public void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
