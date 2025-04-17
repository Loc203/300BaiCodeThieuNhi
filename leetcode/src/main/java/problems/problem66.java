package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class problem66 {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length-1; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //when array all digits are [9,9,9,9,....]
        // initialize new array with all digits are 0 {0,0,0,0,0,....}
        int[] newArr = new int[length+1];
        //=>[1,0,0,0,0,...]
        newArr[0] = 1;

        return newArr;
    }

    public static void main(String[] args) {
        int[] test = {9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(test)));
    }
}
