package problems.problem1;

public class problem1 {
        public int[] twoSum(int[] nums, int target) {
            int[] temp = new int[2];
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        temp[0] = i; temp[1] = j;
                        break;
                    }
                }
            }
            return temp;
        }
}
