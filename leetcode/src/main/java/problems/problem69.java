package problems;

public class problem69 {
    public static int mySqrt(int x) {
        long left = 0, right = x / 2 + 1;
        int count = 0;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long sqr = mid * mid;
            count++;
            if (sqr == x){
                return (int) mid;
            } else if (sqr > x){
                right = mid -1;
            } else {
                left = mid;
            }
        }
        System.out.println(count);
        return (int) left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
