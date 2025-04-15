package problems;

import java.util.ArrayList;

/**
 * You are given two positive integers n and k.
 *
 * An integer x is called k-palindromic if:
 *
 * x is a palindrome.
 * x is divisible by k.
 * An integer is called good if its digits can be rearranged to form a k-palindromic integer. For example, for k = 2, 2020 can be rearranged to form the k-palindromic integer 2002, whereas 1010 cannot be rearranged to form a k-palindromic integer.
 *
 * Return the count of good integers containing n digits.
 *
 * Note that any integer must not have leading zeros, neither before nor after rearrangement. For example, 1010 cannot be rearranged to form 101.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 5
 *
 * Output: 27
 *
 * Explanation:
 *
 * Some of the good integers are:
 *
 * 551 because it can be rearranged to form 515.
 * 525 because it is already k-palindromic.
 * Example 2:
 *
 * Input: n = 1, k = 4
 *
 * Output: 2
 *
 * Explanation:
 *
 * The two good integers are 4 and 8.
 *
 * Example 3:
 *
 * Input: n = 5, k = 6
 *
 * Output: 2468*/
public class problem3272 {
    public static boolean isPalindrome(int x, int k) {
        int temp = 0, var = x;
        while(x > 0){
            temp = temp*10 + x%10;
            x = x/10;
        }
        if(temp==var && temp%k==0) return true;
        return false;
    }

    public static long countGoodIntegers(int n, int k) {
        long min = (long) Math.pow(10,n-1);
        long max = (long) Math.pow(10, n);
        max = max -1;
        int count = 0;
        ArrayList<Integer> temps = new ArrayList<>();


        for (int i = (int) min; i <= max ; i++) {
            if(isPalindrome(i,k)) temps.add(i);
        }
        System.out.println(temps);
        return temps.size();
    }

    public static void main(String[] args) {
        System.out.println(countGoodIntegers(5, 6));
        //chua giai duoc
    }
}
