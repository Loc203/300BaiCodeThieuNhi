package problems.problem3375;
import static java.util.Arrays.stream;

public class problem3375 {
    public static int minOperations1(int[] nums, int k) {
        int[] temp = stream(nums).distinct().sorted().toArray();
        if (temp[0] > k) return temp.length;
        if (temp[0] == k) return temp.length-1;
        return -1;
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) nums[j] = 0;
            }
        }
        for (int num : nums) {
            if (num > k) count++;
        }

        if (count > 0) return count;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,9,1,2,11,12,13,10,10};
        System.out.println(minOperations1(nums, 7));
    }
}
